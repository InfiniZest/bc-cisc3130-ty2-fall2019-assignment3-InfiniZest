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
	Hashtable<Song, Integer> songList = new Hashtable();
	// User selects which song to find its word frequencies
	Scanner getSong = new Scanner(System.in);
	int songIndex = 1;
	int fileIndex = 0;
	for(File file : filesList) {
	    if(file.isFile() & file.getName().endsWith(".txt")) {
		System.out.println("\t" + songIndex + ". " + file.getName());
		songList.put(new Song(file), songIndex);
		songIndex++;
	    }
	    fileIndex++;
	}
	
	System.out.print("\t\t\tTrack Number: ");
	// Scanner scanLyricData = new Scanner(songList[getSong.nextInt()]);
	
    }
}
