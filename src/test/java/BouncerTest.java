import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BouncerTest {
    // AUTHOR : NEAL

    private static Customer customer;
    private static Bouncer bouncer;

    @BeforeAll
    static void createPerson() {
        customer = new Customer("Pearl",14,450.47,true,false);
        bouncer = new Bouncer("BouncyB",100.00);
    }

    @Test
    public void isCustomerOldEnoughToEnterTest() {
        bouncer.isCustomerOldEnoughToEnter(customer);
        Assertions.assertFalse(bouncer.isCustomerOldEnoughToEnter(customer));
    }

    @Test
    public void isCustomerOldEnoughToEnterBribeTest() {
        Assertions.assertTrue(bouncer.isCustomerOldEnoughToEnter(customer,100));
    }
}
