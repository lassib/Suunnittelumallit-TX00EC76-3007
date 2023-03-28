package proxy;

public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying image: " + fileName);
    }

    @Override
    public void showData() {
        System.out.println("Displaying data: " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
