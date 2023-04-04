public abstract class Cake {

    private String name;
    private String flavour;
    private String topping;

    public Cake(String name, String flavour, String topping){
        this.name = name;
        this.flavour = flavour;
        this.topping = topping;
    }

    public abstract String addDecoration();

}
