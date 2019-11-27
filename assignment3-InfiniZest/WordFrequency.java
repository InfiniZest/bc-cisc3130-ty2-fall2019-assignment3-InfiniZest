import java.lang.Comparable;

public class WordFrequency implements Comparable<WordFrequency>{
    String word;
    int frequency;
    
    public WordFrequency(String word) {
	this.word = word;
	frequency = 1;
    }

    // TODO
    @Override
    public int compareTo(WordFrequency item) {
	return 0;
    }

    public boolean equals(Object item) {
	WordFrequency target = (WordFrequency) item;
	if(target.word == word)
	    return true;
	else
	    return false; 
	 
    }

    public void increment() {
	
    }

    public String toString() {
	return "";
    }
}
