import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToiletManTest {

    //Mister D's playground

    @Test
    public void fillToiletStallsWithToiletPaperTest() throws Exception {
        ToiletMan bilal = new ToiletMan("Bilal", 2);
        bilal.fillToiletStallsWithToiletPaper(1);
        Assertions.assertEquals(1, bilal.getToiletPaperStock());


        Assertions.assertThrows(Exception.class, () -> { bilal.fillToiletStallsWithToiletPaper(2);});

    }

    @Test
    public void promoteSafeFunTest(){
        Customer customer = new Customer("Pearl",14,1.00,true,false);
        customer.setDrinksThatTheyDrunk(2);
        ToiletMan bilal = new ToiletMan("Bilal", 2);

        bilal.promoteSafeFun(customer);

        Assertions.assertTrue(customer.isHasCondom());



    }
}






