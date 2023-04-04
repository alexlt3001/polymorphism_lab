import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpongecakeTest {

    Spongecake spongecake;

    @BeforeEach
    public void setUp(){
        spongecake = new Spongecake("Victoria", "Raspberry", "Powdered sugar", "Jam");
    }

    @Test
    public void canAddDecoration(){
        assertThat(spongecake.addDecoration()).isEqualTo("Whipped cream");
    }
}
