public class BarTender extends Staff{
//Mister D

    private double beerPrice;
    private double cocktailPrice;


    public BarTender(String name, double beerPrice, double cocktailPrice) {
        super(name);
        this.beerPrice = beerPrice;
        this.cocktailPrice = cocktailPrice;
    }

    public double getBeerPrice() {
        return beerPrice;
    }

    public void setBeerPrice(double beerPrice) {
        this.beerPrice = beerPrice;
    }

    public double getCocktailPrice() {
        return cocktailPrice;
    }

    public void setCocktailPrice(double cocktailPrice) {
        this.cocktailPrice = cocktailPrice;
    }

    public void buyBeer(Customer customer, int amount){
        if (customer.getEuros()>(getBeerPrice()*amount)){
            customer.setDrinksThatTheyDrunk(customer.getDrinksThatTheyDrunk()+amount);
            customer.setEuros(customer.getEuros()-amount*getBeerPrice());
        }else{
            System.out.println("You're out of money and out of luck buddy! No tabs! get out you bum!");
        }
        //check if customer has enough money
        //and make sure that the customer drinkAmount goes up
        // and money goes down if good
    }

    public void buyCocktail(Customer customer, int amount){
        if (customer.getEuros()>(getCocktailPrice()*amount)){
            customer.setDrinksThatTheyDrunk(customer.getDrinksThatTheyDrunk()+amount);
            customer.setEuros(customer.getEuros()-amount*getCocktailPrice());
        }else{
            System.out.println("You're out of money and out of luck buddy! No tabs! get out you bum!");
        }
        //check if customer has enough money
        //and make sure that the customer drinkAmount goes up
        // and money goes down if good

    }

}
