import java.io.File;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.LinkedList;

public class LyricWordFrequenciesApp {
    public static void main(String[] args) {
	// Words from lyrics will be stored into a LinkedList
	//LinkedList<WordFreq> wordList = new OrderedList();
	// Reads all songs from folder
	System.out.println("Select one of the following tracks from the list below:");
	File folder = new File("Songs");
	File[] songList = folder.listFiles();
	// User selects which song to find its word frequencies
	int index = 1;
	for(File file : songList) {
	    if(file.isFile() & file.getName().endsWith(".txt")) {
		System.out.println("\t" + index + ". " + file.getName());
		index++;
	    }
		    
	}
	// Scanner scan = new Scanner(songFile);
    }
}
