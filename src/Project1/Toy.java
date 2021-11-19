package Project1;
public class Toy {

    /** Name of the toy */
        private String name;
    /** Price of the toy */
        private int price;
    /** Date release of the Toy */
    private int dateReleased;


    /**A class for a Toy object, that has a price, name and date released. It also has getters and 
     * setters for access outside of the class.
     */
    /**
     * Returns the name of the toy
     * @return name of toy object
     */
    public String getName(){ return name;}
    /**
     * Gets price of toy
     * @return price of toy object
     */
    public int getPrice(){ return price;}
    /**
     * Gets the date released of the toy
     * @return date released of toy object
     */
    public int getDateReleased(){return dateReleased;}
    /**
     * Sets the name of the Toy
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * Sets the price of the toy
     * @param price
     */
    public void setPrice(int price){
        this.price=price;
    }
    /**
     * Sets the date released of Toy
     * @param dateReleased
     */
    public void setDateReleased(int dateReleased){
        this.dateReleased=dateReleased;
    }
}
