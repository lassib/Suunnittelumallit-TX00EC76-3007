package factory_method;

public class Rehtori extends AterioivaOtus{
    
    public Juoma createJuoma(){
        return new Sima();
    }
}
