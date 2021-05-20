public class Bouncer extends Staff {
    //Mister D


    private double minimumBribe;


    public Bouncer(String name, double minimumBribe) {
        super(name);
        this.minimumBribe = minimumBribe;
    }

    public double getMinimumBribe() {
        return minimumBribe;
    }

    public void setMinimumBribe(double minimumBribe) {
        this.minimumBribe = minimumBribe;
    }



    public boolean isCustomerOldEnoughToEnter(Customer customer){


        //check ID of the customer and return true if they're old enough
        if (customer.getAge() >= 18){
            return true;
        }else
            return false;
    }

    public boolean isCustomerOldEnoughToEnter(Customer customer,double bribe){
        //check ID of the customer. If customer is too young, they can enter
        //if they give enough money based on minimumBribe
        if(customer.getAge()<18 && bribe < customer.getEuros() && bribe >=getMinimumBribe()){
            customer.setEuros(customer.getEuros()-bribe);
            return true;
        }else

        return false;
    }


}
