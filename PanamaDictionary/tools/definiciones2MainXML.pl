use strict;
use warnings;
$| = 1; #turns off output buffering so that print statements are shown in real-time, and are not buffered till the end

#my $file = 'C:\Users\Jessica\Desktop\eclipseWorkspace\ptydictionary-noaboutus\PanamaDictionary\res\raw\definiciones_v1.txt';
my $inputFile = 'C:\Users\Jessica\Desktop\eclipseWorkspace\definicionesV2.txt';
open(INPUT, $inputFile) or die("can't find $inputFile");
# print "found $inputFile";

my $outputFile = 'C:\Users\Jessica\Desktop\perlLessons\main.xml';
open(OUTPUT,'>'.$outputFile);
my $toPrint = "";

my %dictionary;
$dictionary{'dummyword'} = "dummydef";
my $word = ""; my $def = "";

#####################PROCESS DEFINICIONES.TXT FILE###########################
while(my $line = <INPUT>)
{
	$word = substr($line, 0, index($line, ' = '));
	$def = substr($line, index($line, ' = ') + 2);
	$def =~ s/\n//; #remove new line character
	$def = uc(substr($def,0,0)).substr($def,1); #capitalize first letter of definition
	
	#remove accents from word
	$dictionary{$word} = $def;
	$toPrint .= "dictionarying [$word] = [$def]\n";
}
close(INPUT);

#####################FORMING OUTPUT FILE##########################
#write headers to output file
$toPrint .= "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
$toPrint .= "ScrollView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n";
$toPrint .= "\tandroid:id=\"\@+id/scrollView1\"\n";
$toPrint .= "\tandroid:layout_width=\"match_parent\"\n";
$toPrint .= "\tandroid:layout_height=\"match_parent\" >\n\n";
$toPrint .= "\t<LinearLayout\n";
$toPrint .= "\t\tandroid:orientation=\"vertical\"\n";
$toPrint .= "\t\tandroid:layout_width=\"match_parent\"\n";
$toPrint .= "\t\tandroid:layout_height=\"match_parent\">\n\n\n";
# print $toPrint;
#save word version without accent
my %replace = (
    'á' => "a",
    'é'  => "e",
	'í' => "i",
	'ó' => "o",
	'ú' => "u",
	'Á' => "A",
	'É' => "E",
	'Í' => "I",
	'Ó' => "O",
	'Ú' => "U",
);

my $regex = join "|", keys %replace;
$regex = qr/$regex/;
my $nonAccentedWord = $word;
$nonAccentedWord =~ s/($regex)/$replace{$1}/;
#end of accent distinction
print "$word and without accents $nonAccentedWord\n";
print OUTPUT $toPrint;


close(OUTPUT);
print "find $outputFile for results";
