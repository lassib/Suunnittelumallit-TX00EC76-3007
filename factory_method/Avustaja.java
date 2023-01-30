package factory_method;

public class Avustaja extends AterioivaOtus{
    
    public Juoma createJuoma(){
        return new Olut();
    }
}
