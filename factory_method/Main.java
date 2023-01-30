package factory_method;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        AterioivaOtus rehtori = new Rehtori();
        rehtori.aterioi();
        AterioivaOtus avustaja = new Avustaja();
        avustaja.aterioi();
    }
}
