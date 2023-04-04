public class Cupcake extends Cake {
    private int numberMadePerBatch;

    public Cupcake (String name, String flavour, String topping, int numberMadePerBatch){
        super (name, flavour, topping);
        this.numberMadePerBatch = numberMadePerBatch;
    }
    public String addDecoration(){
        return "Sprinkles";
    }
}
