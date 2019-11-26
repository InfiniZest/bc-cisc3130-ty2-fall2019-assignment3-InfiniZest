/* This class will retrieve song lyrics */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Song {
    private String word;
    
    public Song(File songName) throws FileNotFoundException {
	Scanner songLyricsIn = new Scanner(new FileReader(songName));
	// Belwo reads through the file until EOF
	while(songLyricsIn.hasNext()) {
	    word = songLyricsIn.next();
	    System.out.println(word);
	}
    }
}
