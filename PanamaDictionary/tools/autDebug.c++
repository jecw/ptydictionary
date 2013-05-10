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
	ifstream ifs; cout << "about to open deficiones\n";
	ifs.open("definicionesV1.txt");
	
	ofstream output;
	output.open("PanamaDictionary.java");
	
	string line;
	string lastWord;
	map<string,string> grid;
	cout << "about to enter while\n";
	int count = 0;
	int max = 0;
	// ifs >> max; cout << "max is " << max << endl;
	while (getline(ifs, line)){
		istringstream iss(line);
		string word = "";
		string def = "";
		unsigned separator = line.find('=');
		string line1 = line;
		word = line.substr(0,separator);
		if (word != "" && isalpha(word[0])) {
			def = line1.substr(separator+1);
			cout << "word is " << word << " and def is " << def << endl;
			grid[word] = def;
			// cout << "about to enter for loop\n";
			// for (int col = 0; col < 350; ++col) {
				// cout << "checking if =, it's " << line[col] << "\n";
				// if (line[col] != '=' && line[col] != '\0') { 
					// word += line[col]; cout << "not =, saving word " << word << "\n";
				// } else if (line[col] == '=' && line[col] != '\0') { // save definition
					// word = word.substr(0,word.length() - 1);
					
					// col = col + 2;
					// cout << "found = with line[col] " << line[col] << " and col " << col << "\n";
					// defindex = 0;
					// while (line[col] != '\n') {
						// cout << "saving definition for " << word << "\n";
						// def += line[col]; 
						// cout << "def so far " << def << endl;
						// ++col;
					// }
					// grid[word] = def;
					// break;
				// }
			// }
			lastWord = word;
		}
		ifs.clear();
		// count++;
	} ifs.close();
	
	
	
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
		capitalized[0] = toupper(capitalized[0]);
		
		if (word != lastWord) {
			output <<"b" << capitalized << ", ";
		} else {
			output <<"b" << capitalized << ";\n";
		}
	}
	output << "count is " << count << endl;
	//MediaPlayer
/*	for (it_type iterator = grid.begin(); iterator != grid.end(); iterator++) {
		char[] word = "";
		char[] def = "";
		iterator->first = word;
		iterator->second = def;
		
		output <<"\tMediaPlayer ";
		if (word != lastWord) {
			output <<word << ", ";
		} else {
			output <<word << ";\n\n";
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
		char[] word = "";
		char[] def = "";
		iterator->first = word;
		iterator->second = def;
		
		char[] cap = word;
		cap[0] = toupper(cap[0]);
		
		output <<"\t\tb" << cap << " = (Button) findViewById(R.id.b" << cap << "Sound);\n";
		output <<"\t\tb" << cap <<".setOnClickListener(this);\n";
		output <<"\t\t" << word << " = MediaPlayer.create(PanamaDictionary.this, R.raw." << word << ");\n\n";
	} 
	
	output <<"\t}\n\n";
	output <<"\tpublic void onClick(View v) {\n";
	output <<"\t\t// TODO Auto-generated method stub\n";
	output <<"\t\tswitch(v.getId()){\n";
	
	//cases inside onClick(View v)
	for (it_type iterator = grid.begin(); iterator != grid.end(); iterator++) {
		char[] word = "";
		char[] def = "";
		iterator->first = word;
		iterator->second = def;
		
		char[] cap = word;
		cap[0] = toupper(cap[0]);
		
		output <<"\t\tcase R.id.b" << cap << "Sound:\n";
		output <<"\t\t\t" << word <<".start();\n";
		output <<"\t\t\t" << "break;\n";
	} 
	output <<"\t\t}\n"; //end of switch
	output <<"\t}\n"; //end of onClick(View v)
	output <<"}\n"; */
	
	output.close();
	return 0;
}
