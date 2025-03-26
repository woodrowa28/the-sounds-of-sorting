package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 * @param <T> the carrier type of the array
 */
public class CompareEvent<T> implements SortEvent<T> {
    
    private List<Integer> indices;
    
    public CompareEvent(int ind1, int ind2) {
        indices = new ArrayList();
        indices.add(ind1);
        indices.add(ind2);
    }
    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    @Override
    public void apply(T[] arr) { }

    /**
     * @return a list of the indices affected by this event
     */
    @Override
    public List<Integer> getAffectedIndices() {
        return indices;
    }

    /**
     * @return <code>true</code> if this event is emphasized
     */
    @Override
    public boolean isEmphasized() {
        return false;
    }
}
