package facade;

public class ComputerFacade {

    private final CPU cpu;
    private final RAM ram;
    private final HDD hdd;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public void start() {
        cpu.freeze();
        ram.load(0, hdd.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
    }
}
