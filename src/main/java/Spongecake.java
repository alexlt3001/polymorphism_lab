public class Spongecake extends Cake {

    private String filling;

    public Spongecake (String name, String flavour, String topping,String filling){
        super(name, flavour, topping);
        this.filling = filling;
    }

    public String addDecoration(){
        return "Whipped cream";
    }
}
