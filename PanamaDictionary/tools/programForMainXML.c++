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
	
	//*************************************main.xml
 	output.open("main.xml");
	//print headers
	output <<"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
	output <<"<ScrollView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n";
	output <<"\tandroid:id=\"@+id/scrollView1\"\n";
	output <<"\tandroid:layout_width=\"match_parent\"\n";
	output <<"\tandroid:layout_height=\"match_parent\" >\n\n";
	output <<"\t<LinearLayout\n";
	output << "\t\tandroid:orientation=\"vertical\"\n";
	output << "\t\tandroid:layout_width=\"match_parent\"\n";
	output << "\t\tandroid:layout_height=\"match_parent\">\n\n\n";
	
	
	typedef map<string, string>::iterator it_type;
	for(it_type iterator = grid.begin(); iterator != grid.end(); iterator++) {
		string word;
		string def;
		word = iterator->first;
		def = iterator->second;
		
		// string capitalized = word;
		// capitalized[0] = toupper(capitalized[0]);
		
		output << "\t<LinearLayout android:layout_width=\"fill_parent\"\n";
		output << "\t\tandroid:layout_height=\"wrap_content\"\n";
		output << "\t\tandroid:orientation=\"horizontal\"\n";
		output << "\t\tandroid:weightSum=\"100\">\n";
			output << "\t\t<TextView android:text=\"" << word << "\"\n";
			output << "\t\t\tandroid:id=\"@+id/tv" << word << "Term\"\n";
			output << "\t\t\tandroid:textSize=\"20sp\"\n";
			output << "\t\t\tandroid:layout_width=\"wrap_content\"\n";
			output << "\t\t\tandroid:layout_height=\"wrap_content\"\n";
			output << "\t\t\tandroid:layout_weight=\"10\"\n";
			output << "\t\t\tandroid:typeface=\"serif\"\n";
			output << "\t\t\tandroid:textStyle=\"bold\"\n";
			output << "\t\t\tandroid:textColor=\"#ffffff\" >\n";
			output << "\t\t</TextView>\n";
			
			output << "\t\t<Button android:layout_height=\"fill_parent\"\n";
			output << "\t\t\tandroid:id=\"@+id/b" << word << "Sound\"\n";
			output << "\t\t\tandroid:layout_width=\"wrap_content\"\n";
			output << "\t\t\tandroid:background=\"@drawable/custom\"\n";
			output << "\t\t\tandroid:typeface=\"serif\" >\n";
			output << "\t\t</Button>\n";
			output << "\t</LinearLayout>\n";
			output << "\t<TextView android:layout_height=\"wrap_content\" android:id=\"@+id/tv" << word << "Def\"\n";
			output << "\t\tandroid:layout_width=\"fill_parent\" android:text=\""<< def << "\"\n";
			output << "\t</TextView>\n\n\n";
	}
	

	//last LinearLayout
	output <<"\t<LinearLayout>\n";
	output << "</ScrollView>";
	
	output.close();
	return 0;
}
