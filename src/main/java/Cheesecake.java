import java.net.InetAddress;

public class Cheesecake extends Cake {

    private String base;

    public Cheesecake(String name, String flavour, String topping, String base){
        super(name, flavour, topping);
        this.base = base;
    }
    public String setInFridge(){
        return "Must set in fridge overnight before sale";
    }
    public String addDecoration(){
        return "Lemon peel";
    }
}
