package adapter;

public class Main {

    public static void main(String[] args) {
        HDMISignal hdmiSignal = new HDMISignal();
        AnalogSignal dviSignal = new DVISignal();

        AnalogSignal signalAdapter = new SignalAdapter(hdmiSignal);

        System.out.println("HDMI Signal:");
        hdmiSignal.display();
        System.out.println("DVI Signal:");
        dviSignal.displayAnalog();
        System.out.println("HDMI Signal via DVI Adapter:");
        signalAdapter.displayAnalog();
    }
}
