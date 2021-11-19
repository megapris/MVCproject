package Project1;


public class ToyView {
    /** Class that returns information for user to view */

   /**
    * Returns simple information about Toy
    * @param toyName name of the Toy
    * @return the name of the Toy
    */ 
    public String printToyInfo(String toyName){
        return toyName;

    }

    /**
     * Returns detailed information about toy to update on view
     * @param toyName
     * @param toyPrice
     * @param toyDate
     * @return
     */
    public String printToyDeets(String toyName, int toyPrice, int toyDate){
        return "Name: " +toyName + "\nPrice: " + toyPrice +"\nDate Released: "+ toyDate;

    }
}
