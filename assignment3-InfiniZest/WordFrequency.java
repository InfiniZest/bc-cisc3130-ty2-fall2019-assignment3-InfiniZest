import java.lang.Comparable;

public class WordFrequency implements Comparable<WordFrequency>{
    String word;
    int frequency;
    
    public WordFrequency(String word) {
	this.word = word;
	this.frequency = 1;
    }

    // TODO
    @Override
    public int compareTo(WordFrequency item) {
	return Integer.valueOf(this.frequency).compareTo(item.frequency);
    }

    public boolean equals(Object item) {
	WordFrequency target = (WordFrequency) item;
	if(target.word.equalsIgnoreCase(this.word))
	    return true;
	else
	    return false; 
    }

    public void increment() {
	frequency++;
    }

    public String toString() {
	return this.word + " " + this.frequency;
    }
}
