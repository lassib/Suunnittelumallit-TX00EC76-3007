import factorymethod.AterioivaOtus;
import factorymethod.Juoma;

public class Avustaja extends AterioivaOtus{
    
    public Juoma createJuoma(){
        return new Olut();
    }
}
