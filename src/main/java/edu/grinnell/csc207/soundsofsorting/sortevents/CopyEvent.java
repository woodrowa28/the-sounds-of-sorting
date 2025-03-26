package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 * @param <T> the carrier type of the array
 */
public class CopyEvent<T> implements SortEvent<T> {
    
    List<Integer> indices;
    
    T element;
    
    public CopyEvent(int i, T e) {
        indices = new ArrayList();
        indices.add(i);
        element = e;
    }
    /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    @Override
    public void apply(T[] arr) {
        arr[indices.get(0)] = element;
    }

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
        return true;
    }
}
