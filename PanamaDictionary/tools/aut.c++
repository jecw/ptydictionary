#include <cassert> // assert
#include <iostream> // cout, endl
#include <stdexcept> // invalid_argument, out_of_range
#include <stdlib.h>
#include <fstream>
#include <map>
#include <string>
#include <stdio.h>
#include <ctype.h>
#include <sstream>
// #include "definicionesV1.txt"

int main () {
    using namespace std;
    ios_base::sync_with_stdio(false); // turn off synchronization with C I/O
	ifstream ifs;
	ifs.open("definicionesV1.txt");
	string line;
	string lastWord;
	map<string,string> grid;
	
	while (getline(ifs, line)){
		istringstream iss(line);
		string word = "";
		string def = "";
		unsigned separator = line.find('=');
		// string line1 = line;
		word = line.substr(0,separator - 1);
		if (word != "" && isalpha(word[0])) {
			def = line.substr(separator+1);
			// cout << "word is " << word << " and def is " << def << endl;
			def[0] = toupper(def[0]);
			if (def[def.length()-1] != '.')
				def += '.'; //agregar punto de oracion. Chequear
			grid[word] = def;
			lastWord = word;
		}
		ifs.clear();
	} ifs.close();
	
	ofstream output;
	output.open("PanamaDictionary.java");
	
	//print headers
	output <<"//PanamaDictionary.java\n\npackage jecw.pty;\n\n";
	map<int,string> importGrid;
	importGrid[0] = "app.Activity;";
	importGrid[1] = "media.AudioManager;";
	importGrid[2] = "media.MediaPlayer;";
	importGrid[3] = "os.Bundle;";
	importGrid[4] = "view.View;";
	importGrid[5] = "view.View.OnClickListener;";
	importGrid[6] = "widget.Button;";
	
	for (int importIndex = 0; importIndex < importGrid.size(); ++importIndex){
		output <<"import android." << importGrid[importIndex] << endl;
	} output <<"\n\npublic class PanamaDictionary extends Activity implements OnClickListener {\n\n";
	
	//Button
	output <<"\tButton ";
	typedef map<string, string>::iterator it_type;
	for(it_type iterator = grid.begin(); iterator != grid.end(); iterator++) {
		string word;
		string def;
		word = iterator->first;
		def = iterator->second;
		
		string capitalized = word;
		// capitalized[0] = toupper(capitalized[0]);
		
		if (word != lastWord) {
			output <<"b" << capitalized << ", ";
		} else {
			output <<"b" << capitalized << ";\n";
		}
	}
	
	//MediaPlayer
	output <<"\tMediaPlayer ";
	for (it_type iterator = grid.begin(); iterator != grid.end(); iterator++) {
		string word = "";
		string def = "";
		word = iterator->first;
		def = iterator->second;
		
		string small = word;
		small[0] = tolower(small[0]);
		
		if (word != lastWord) {
			output << small << ", ";
		} else {
			output << small << ";\n\n";
		}
	} 
	
	output <<"\t// Called when the activity is first created.\n";
	output <<"\t@Override\n";
	output <<"\tpublic void onCreate(Bundle savedInstanceState) {\n";
	output <<"\t\tsuper.onCreate(savedInstanceState);\n";
	output <<"\t\tthis.setVolumeControlStream(AudioManager.STREAM_MUSIC);\n";
	output <<"\t\tsetContentView(R.layout.main);\n\n";
	
	//Button	setOnClickListener		MediaPlayer
	for (it_type iterator = grid.begin(); iterator != grid.end(); iterator++) {
		string word = "";
		string def = "";
		word = iterator->first;
		def = iterator->second;
		
		string small = word;
		small[0] = tolower(small[0]);
		// string small = word;
		
		output <<"\t\tb" << word << " = (Button) findViewById(R.id.b" << word << "Sound);\n";
		output <<"\t\tb" << word <<".setOnClickListener(this);\n";
		output <<"\t\t" << small << " = MediaPlayer.create(PanamaDictionary.this, R.raw." << small << ");\n\n";
	} 
	
	output <<"\t}\n\n";
	output <<"\tpublic void onClick(View v) {\n";
	output <<"\t\t// TODO Auto-generated method stub\n";
	output <<"\t\tswitch(v.getId()){\n";
	
	//cases inside onClick(View v)
	for (it_type iterator = grid.begin(); iterator != grid.end(); iterator++) {
		string word = "";
		string def = "";
		word = iterator->first;
		def = iterator->second;
		
		string small = word;
		small[0] = tolower(small[0]);
		
		output <<"\t\tcase R.id.b" << word << "Sound:\n";
		output <<"\t\t\t" << small <<".start();\n";
		output <<"\t\t\t" << "break;\n";
	} 
	output <<"\t\t}\n"; //end of switch
	output <<"\t}\n"; //end of onClick(View v)
	output <<"}\n"; 
	
	output.close();
	return 0;
}
