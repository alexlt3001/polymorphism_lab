import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheesecakeTest {

    Cheesecake cheesecake;

    @BeforeEach
    public void setUp(){
        cheesecake = new Cheesecake("New York","Lemon", "Rind", "Biscuit");
    }
    @Test
    public void canSetInFridge(){
        assertThat(cheesecake.setInFridge()).isEqualTo("Must set in fridge overnight before sale");
    }
    @Test
    public void canAddDecoration(){
        assertThat(cheesecake.addDecoration()).isEqualTo("Lemon peel");
    }
}
