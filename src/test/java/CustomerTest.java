import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomerTest {


//GUTS

    @Test
    public void feelingConfident(){
        Customer diederik = new Customer("Diederik",14,50.00,true,true);
        diederik.setDrinksThatTheyDrunk(6);
        diederik.feelingConfident();
        Assertions.assertTrue(diederik.feelingConfident());
    }


    @Test
    public void tipTheCuteStaff(){
        BarTender Guts = new BarTender("Guts",2.50,5.00);
        Customer diederik = new Customer("Diederik",14,50.00,true,false);

        diederik.setDrinksThatTheyDrunk(5);
        diederik.tipTheCuteStaff(Guts);
        Assertions.assertEquals(diederik.getDrinksThatTheyDrunk()*1.50,Guts.getAmountsOfTips());


    }





}
