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
	System.out.println(word + " " + item.word);
	if(item.word.equalsIgnoreCase(word)) 
	    return 0;
	else
	    return -1;
    }

    public boolean equals(Object item) {
	WordFrequency target = (WordFrequency) item;
	if(target.word.equalsIgnoreCase(word))
	    return true;
	else
	    return false; 
	 
    }

    public void increment() {
	frequency++;
    }

    public String toString() {
	return "";
    }
}
