import java.lang.Comparable;

public class WordFrequency implements Comparable{
    String word;
    int frequency;
    
    public WordFrequency(String word) {
	this.word = word;
	frequency = 1;
    }

    // TODO
    @Override
    public int compareTo(Object item) {
	return 0;
    }

    public boolean equals(Object item) {
	return false;
    }

    public void increment() {
	
    }

    public String toString() {
	return "";
    }
}
