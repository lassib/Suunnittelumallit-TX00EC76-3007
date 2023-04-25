package facade;

public class HDD {

    private final byte[] data = new byte[1024];

    public HDD() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
    }

    public byte[] read(long lba, int size) {
        System.out.println("HDD read " + size + " bytes from " + lba);
        return data;
    }
}
