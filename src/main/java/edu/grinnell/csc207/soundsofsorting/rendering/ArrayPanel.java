package edu.grinnell.csc207.soundsofsorting.rendering;
import edu.grinnell.csc207.soundsofsorting.audio.NoteIndices;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;

/**
 * A drawing panel for visualizing the contents of a @NoteIndices object.
 */
public class ArrayPanel extends JPanel {
    @SuppressWarnings("unused")
    private NoteIndices notes;
   
    /**
     * Create a new <code>ArrayPanel</code> with the given notes and dimensions.
     * @param notes the note indices 
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
        int numNotes = notes.getNotes().length;
        int barWidth = getWidth() / numNotes;
        int heightUnit = getHeight() / numNotes;
        int rectHeight;
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        for (int i = 0; i < numNotes; i++) {
            int currNote = notes.getNotes()[i];
            g.setColor(new Color(0, 255 * (currNote + 1) / numNotes / 2, 
                    255 * (1 - currNote / numNotes) / 2));
            if (notes.isHighlighted(i)) {
                g.setColor(g.getColor().brighter());
            }
            rectHeight = (currNote + 1) * heightUnit;
            g.fillRect(i * barWidth, getHeight() - rectHeight, barWidth, rectHeight);
        }
    }
}