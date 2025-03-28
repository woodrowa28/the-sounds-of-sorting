package edu.grinnell.csc207.soundsofsorting.audio;

import java.util.ArrayList;
import java.util.Random;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {
    
    Integer[] notes;
    ArrayList<Integer> highlightedNotes;
    
    /**
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
        notes = new Integer[n];
        highlightedNotes = new ArrayList();
    }
    
    /**
     * Re-initializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
        notes = new Integer[n];
        for (int i = 0; i < n; i++) {
            notes[i] = i;
        }
        
        // Shuffle algorithm from woodrow28/blocky/BlockyGame.java
        for (int i = notes.length - 1; i > 0; i--) {
            int rand = new Random().nextInt(i + 1);
            Integer temp = notes[i];
            notes[i] = notes[rand];
            notes[rand] = temp;
        }
    }
    
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
        return notes;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
        highlightedNotes.add(index);
    }
    
    /**
     * @param index the index to check
     * @return true if the given index is highlighted
     */
    public boolean isHighlighted(int index) {
        for (Integer note : highlightedNotes) {
            if(note.equals(index)) {
                return true;
            }
        }
        return false;
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        highlightedNotes.clear();
    }
}
