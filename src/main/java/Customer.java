public class Customer {
    // AUTHOR : NEAL

    private String name;
    private int age;
    private double euros;
    private boolean DTF;
    private boolean hasCondom;
    private int drinksThatTheyDrunk;
    private final double tippingAmount = 1.50;

    public Customer() {
    }

    public Customer(String name, int age, double euros, boolean DTF, boolean hasCondom) {
        this.name = name;
        this.age = age;
        this.euros = euros;
        this.DTF = DTF;
        this.hasCondom = hasCondom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    public boolean isDTF() {
        return DTF;
    }

    public void setDTF(boolean DTF) {
        this.DTF = DTF;
    }

    public boolean isHasCondom() {
        return hasCondom;
    }

    public void setHasCondom(boolean hasCondom) {
        this.hasCondom = hasCondom;
    }

    public int getDrinksThatTheyDrunk() {
        return drinksThatTheyDrunk;
    }

    public void setDrinksThatTheyDrunk(int drinksThatTheyDrunk) {
        this.drinksThatTheyDrunk = drinksThatTheyDrunk;
    }

    public boolean feelingConfident(){
        //check if they drank more than 5 beers, if they have a condom and if they're DTF

        if(drinksThatTheyDrunk > 5 && hasCondom && DTF) {
            System.out.println("I am feeling confident!");
            return true;
        }
        else {
            System.out.println("I ain't got no confidence :(");
            return false;
        }
    }

    public double tipTheCuteStaff(Staff staff){
        //check how many drinks you had.
        //multiply that amount of drinks with the tippingAmount
        //check if you have enough money. If the amount is too low,
        //only give the amount that you have left
        //return the amount of money you have left


        System.out.println("I've drank " + getDrinksThatTheyDrunk() + " drinks.");

        double totalTippingAmount = getDrinksThatTheyDrunk() * tippingAmount;
        if(euros < totalTippingAmount) {
            System.out.println("I only got about " + String.format("%.2f",euros)  + " left, sorry can't tip bigger!");
            System.out.println("* tipping €" + String.format("%.2f",totalTippingAmount) + " *");
            euros =- euros;
            staff.setAmountsOfTips(staff.getAmountsOfTips() + euros);
        }
        else {
            System.out.println("* tipping €" + String.format("%.2f",totalTippingAmount) + " *");
            euros =- totalTippingAmount;
            staff.setAmountsOfTips(staff.getAmountsOfTips() + totalTippingAmount);
        }
        return euros;
    }
}
