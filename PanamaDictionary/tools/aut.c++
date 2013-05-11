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
		unsigned separator = line.find( ' = ');
		// string line1 = line;
		word = line.substr(0,separator);
		if (word != "" && isalpha(word[0])) {
			def = line.substr(separator + 3);
			
			unsigned end = def.find('\n');
			def = line.substr(separator + 3, end-1);
			
			//capitalize first letter of definition
			def[0] = toupper(def[0]);
			// if (def[def.length()-1] != '.')
				// def += '.'; //agregar punto de oracion. Chequear
			
			//remove accents from word
			int findA = word.find('á'); int findE = word.find('é'); int findI = word.find('í'); int findO = word.find('ó'); int findU = word.find('ú');
			if (findA != -1) word = word.substr(0, findA-1) + 'a' + word.substr(findA+1);
			if (findE != -1) word = word.substr(0, findE-1) + 'e' + word.substr(findE+1);
			if (findI != -1) word = word.substr(0, findI-1) + 'i' + word.substr(findI+1);
			if (findO != -1) word = word.substr(0, findO-1) + 'o' + word.substr(findO+1);
			if (findU != -1) word = word.substr(0, findU-1) + 'u' + word.substr(findU+1);
			// if (word.find("Xopa") != -1) cout << findE << endl;
			
			grid[word] = def;
			lastWord = word;
		}
		ifs.clear();
	} ifs.close();
	
	ofstream output;
	/*
	//*************************************beginning of strings.xml************************
	output.open("strings.xml");
	/////***print headers
	output << "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<resources>\n";
	typedef map<string, string>::iterator it_type;
	for(it_type iterator = grid.begin(); iterator != grid.end(); iterator++) {
		string word;
		string def;
		word = iterator->first;
		def = iterator->second;
		
		//undo capitalization of words
		string small = word;
		small[0] = tolower(small[0]);
		
		//////**remove accents from word
		// int findA = word.find('á'); int findE = word.find('é'); int findI = word.find('í'); int findO = word.find('ó'); int findU = word.find('ú');
		// if (findA != -1) word = word.substr(0, findA-1) + 'a' + word.substr(findA+1);
		// else if (findE != -1) word = word.substr(0, findE) + 'e' + word.substr(findE+1);
		// else if (findI != -1) word = word.substr(0, findI-1) + 'i' + word.substr(findI+1);
		// else if (findO != -1) word = word.substr(0, findO-1) + 'o' + word.substr(findO+1);
		// else if (findU != -1) word = word.substr(0, findU-1) + 'u' + word.substr(findU+1);
		
		// if (word.find("Xopa") != -1) cout << findE << endl;
		
		/////def in one line
		int findNewLine = def.find('\n');
		if (findNewLine != -1) def = def.substr(0,findNewLine-1);
		else {
			int findR = def.find('\r');
			def = def.substr(0,findR);
		}
		
		//add period to def
		char period = '.';
		char last = def[def.length()-1];
		if (isalpha(last)) def += period;
		
		
		output << "\t<string name=\"" << small << "\">" << def << "</string>\n";
	}
	output << "</resources>\n"; 
	//*************************************end of strings.xml**********************
	*/
	
	//*************************************PanamaDictionary.java
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
	//*************************************end of PanamaDictionary.java
	
	output.close();
	return 0;
}
