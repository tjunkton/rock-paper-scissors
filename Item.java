package rps;

import java.util.Arrays;

public class Item {
    String displayName;
    String[] beats;

    public Item(String displayName, String[] beats) {
        this.displayName = displayName;
        this.beats = beats;
        System.out.println("made item " + displayName + ", beats " + Arrays.toString(beats));
    }
}