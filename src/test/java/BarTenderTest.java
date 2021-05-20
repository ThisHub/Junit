import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BarTenderTest {

    @Test
    public void buyBeertest(){
        Customer customer = new Customer("Pearl",14,1.00,true,false);
        BarTender barTender = new BarTender("Jens", 1.5, 3.5);
        barTender.buyBeer(customer,2);
        Assertions.assertEquals(1,customer.getEuros());
        Assertions.assertEquals(0,customer.getDrinksThatTheyDrunk());
    }

    @Test
    public void buyCoctailTest(){

    }


}
