import java.util.ArrayList;

public  class Bakery {
    private ArrayList<Cake> cake;

    public Bakery(){
        this.cake = new ArrayList<>();
    }
    public int countCake(){
        return this.cake.size();
    }
    public void addCake(Cake cake){
        this.cake.add(cake);
    }
}
