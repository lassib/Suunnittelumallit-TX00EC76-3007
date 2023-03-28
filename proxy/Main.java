package proxy;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");

        List<Image> images = List.of(image1, image2, image3);

        System.out.println("Images available: ");
        for (Image image : images) {
            image.showData();
        }

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        boolean ask = true;
        while (ask) {
            System.out.println("Enter 1 to display next image, 2 to display previous image, 3 to show data, 4 to exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    if (i < images.size() - 1)
                        i++;
                    images.get(i).displayImage();
                }
                case 2 -> {
                    if (i > 0)
                        i--;
                    images.get(i).displayImage();
                }
                case 3 -> images.get(i).showData();
                case 4 -> ask = false;
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
