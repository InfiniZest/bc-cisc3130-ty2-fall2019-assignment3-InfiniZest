/******************************************************************************
 *  IMRAN KHAN | 23304096
 *  WordFrequency.java is the heart of the operation for finding word 
 *  frequencies, specifically, in the case of this project is lyrical 
 *  frequencies.
 ******************************************************************************/

import java.lang.Comparable;

public class WordFrequency implements Comparable<WordFrequency>{
    String word;
    int frequency;
    
    public WordFrequency(String word) {
	this.word = word;
	this.frequency = 1;
    }

    @Override
    public int compareTo(WordFrequency item) {
	return Integer.valueOf(item.frequency).compareTo(this.frequency);
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
	return this.frequency + ": " + this.word;
    }
}
