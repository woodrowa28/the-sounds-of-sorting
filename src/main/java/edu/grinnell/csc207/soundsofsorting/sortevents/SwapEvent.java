package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 *
 * @param <T> the carrier type of the array
 */
public class SwapEvent<T> implements SortEvent<T> {

    List<Integer> indices;

    public SwapEvent(int ind1, int ind2) {
        indices = new ArrayList();
        indices.add(ind1);
        indices.add(ind2);
    }

    /**
     * Applies this event to the array.
     *
     * @param arr the array to modify
     */
    @Override
    public void apply(T[] arr) {
        T temp = arr[indices.get(0)];
        arr[indices.get(0)] = arr[indices.get(1)];
        arr[indices.get(1)] = temp;
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
