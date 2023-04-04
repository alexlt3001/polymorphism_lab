import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;

    @BeforeEach
    public void setUp(){
        bakery = new Bakery();
    }

    @Test
    public void bakeryStartsEmpty(){
        assertThat(bakery.countCake()).isEqualTo(0);
    }

    @Test
    public void canAddCake(){
        Cake cake1 = new Cheesecake("New York", "Lemon", "Rind", "Biscuit");
        Cake cake2 = new Spongecake("Victoria", "Raspberry", "Powdered sugar", "Jam");
        Cake cake3 = new Cupcake("Fairy", "Vanilla", "Fondant icing", 24);
        bakery.addCake(cake1);
        bakery.addCake(cake2);
        bakery.addCake(cake3);
        assertThat(bakery.countCake()).isEqualTo(3);
    }
}
