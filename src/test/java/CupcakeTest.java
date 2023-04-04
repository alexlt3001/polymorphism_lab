import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {
    Cupcake cupcake;
    @BeforeEach
    public void setUp(){
        cupcake = new Cupcake("Fairy", "Vanilla", "Fondant icing", 24);
    }

    @Test
    public void canAddDecoration(){
        assertThat(cupcake.addDecoration()).isEqualTo("Sprinkles");
    }

}
