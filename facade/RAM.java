package facade;

import java.util.Arrays;

public class RAM {

    public void load(long position, byte[] data) {
        System.out.println("RAM loaded " + Arrays.toString(data) + " from " + position);
    }
}
