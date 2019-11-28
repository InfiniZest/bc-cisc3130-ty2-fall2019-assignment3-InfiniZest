/* This class will retrieve song lyrics */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.LinkedList;    

public class Song {
    private String word;
    private WordFrequency wordFreq;
    private ListIterator<WordFrequency> iterator;
    private LinkedList<WordFrequency> orderedWordList;
    
    public Song(File songName) throws FileNotFoundException {
	Scanner songLyricsIn = new Scanner(songName);
	orderedWordList = new LinkedList<WordFrequency>();
	
	// Below reads through the file until EOF
	while(songLyricsIn.hasNext()) {
	    word = songLyricsIn.next();
	    while(word.endsWith(".") | word.endsWith(",") | word.endsWith(")") | word.endsWith("?") | word.endsWith("!"))
		word = word.substring(0, word.length() - 1);
	    if(word.startsWith("("))
		word = word.substring(1, word.length());
	    wordFreq = new WordFrequency(word);
	    iterator = search(orderedWordList, wordFreq);
	    if(iterator != null)
		iterator.next().increment();
	    else
		orderedWordList.add(wordFreq);
	}
    }

    // The <T extends Comparable<? super T>> is the generic method
    // The ListIterator<T> is the parameter and return type
    public static <T extends Comparable<? super T>> ListIterator<T> search(LinkedList<T> ordList, T target) {
	// Initilize List Iterator
	ListIterator<T> iter = ordList.listIterator();
	T curr;
	int i = 0;

	// TODO! ListIterator isn't traversing through anything!
	// Traverse through iter
	while(iter.hasNext()) {
	    // gets the current list value
	    curr = iter.next();
	    // checks if the current value matches the target value
	    if(curr.equals(target)) {
		// don't set curr instead go to the previous iter and return that
		iter.previous();
		return iter;
	    } else if(target.compareTo(curr) < 0) 
		return null;
	}
	return null;  
    }
    
    public void getWordFrequency() {
	ListIterator iter = orderedWordList.listIterator(0);
	int count = 0;
	int i;
	String blanks;

	while(iter.hasNext()) {
	    String str = iter.next().toString();
	    System.out.println(str);
	}
    }
}
