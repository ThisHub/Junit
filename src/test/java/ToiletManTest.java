import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToiletManTest {

    //Mister D's playground

    @Test
    public void fillToiletStallsWithToiletPaperTest() throws Exception {
        ToiletMan bilal = new ToiletMan("Bilal", 2);
        bilal.fillToiletStallsWithToiletPaper(1);
        Assertions.assertEquals(1, bilal.getToiletPaperStock());
        bilal.fillToiletStallsWithToiletPaper(2);

        
    }
    }





