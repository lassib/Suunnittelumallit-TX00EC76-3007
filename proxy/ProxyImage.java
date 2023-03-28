package proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }

    @Override
    public void showData() {
        System.out.println("Displaying data: " + fileName);
    }
}
