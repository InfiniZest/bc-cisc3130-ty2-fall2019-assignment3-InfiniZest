/******************************************************************************
 *  IMRAN KHAN | 23304096
 *  LyricWordFrequenciesApp.java is the main driver app that retrives the song 
 *  file path(s) and instantiates the Song class which stores the selected 
 *  song in a list structure and performs frequency operations.
******************************************************************************/

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ListIterator;
import java.util.Hashtable;

public class LyricWordFrequenciesApp {
    public static void main(String[] args) throws IOException {
	// Words from lyrics will be stored into a LinkedList
	//LinkedList<WordFreq> wordList = new OrderedList();
	// Reads all songs from folder
	System.out.println("Select one of the following tracks from the list below:");
	File folder = new File("Songs");
	File[] filesList = folder.listFiles();
	Hashtable<Integer, Song> songList = new Hashtable<Integer, Song>();
	// User selects which song to find its word frequencies
	Scanner getSong = new Scanner(System.in);
	int songIndex = 1;
	int fileIndex = 0;
	for(File file : filesList) {
	    if(file.isFile() & file.getName().endsWith(".txt")) {
		System.out.println("\t" + songIndex + ". " + file.getName());
		songList.put(songIndex, new Song(file));
		songIndex++;
	    }
	    fileIndex++;
	}
	System.out.print("\t\t\tTrack Number: ");
	Scanner scanLyricData = new Scanner(System.in);
	int trackSelected = scanLyricData.nextInt();
	Song selectedSong = songList.get(trackSelected);
	selectedSong.getWordFrequency();
	getSong.close();
	scanLyricData.close();
    }
}
