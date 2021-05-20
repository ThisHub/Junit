public class ToiletMan extends Staff {

    private int toiletPaperStock;


    public ToiletMan(String name, int toiletPaperStock) {
        super(name);
        this.toiletPaperStock = toiletPaperStock;
    }

    public int getToiletPaperStock() {
        return toiletPaperStock;
    }

    public void setToiletPaperStock(int toiletPaperStock) {
        this.toiletPaperStock = toiletPaperStock;
    }



    private void fillToiletStallsWithToiletPaper(int amountOfStalls) throws Exception {
        //remove the amount of your stock
        //this method will throw a selfmade Exception if you're
        //out of toilet paper
        if (toiletPaperStock < amountOfStalls) {
            throw new Exception("No luck use your hands sir");


        }
        this.toiletPaperStock -= amountOfStalls;


    }





    private void promoteSafeFun(Customer customer){
        //check if Customer is DTF and if he has no condom
        //AND if he had less than 3 drinks
        //give them a condom
        if (customer.isDTF() && !customer.isHasCondom() && customer.getDrinksThatTheyDrunk()<3){
            customer.setHasCondom(true);



        }
    }
}
