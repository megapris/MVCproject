package Project1;

public class ToyController {
    /** Model according to MVC desing */
    private Toy model;
    /** View according to MVC view */
    private ToyView view;

    /** This controller class allows for the interaction 
     * between the model and the view and the user */

    /**
     * Constructor for a controller
     * @param model
     * @param view
     */
    public ToyController(Toy model, ToyView view){
        this.model=model;
        this.view=view;
    }
    /**
     * Sets the name of the toy
     * @param name
     */
    public void setToyName(String name){
        model.setName(name);
    }
    /**
     * Sets the date released of the toy
     * @param date
     */
    public void setToyDate(int date){
        model.setDateReleased(date);
    }
    /**
     * Sets the price of the toy
     * @param price
     */
    public void setToyPrice(int price){
        model.setPrice(price);
    }

    /**
     * Gets the Toy Name
     * @return name of toy
     */
    public String getToyName(){return model.getName();}
    /**
     * Gets the Toy Price
     * @return price of Toy
     */
    public int getToyPrice(){return model.getPrice();}
    /**
     * Gets toy Date
     * @return the date of release of the toy
     */
    public int getToyDate(){return model.getDateReleased();}

    
    /**
     * Returns toy information to update the view on the GUI
     * @param modelo the model object carrying data
     * @return data about Toy
     */
    public String updateView(Toy modelo){
         return view.printToyInfo(modelo.getName());
    }
    /**
     * Returns a detailed information of the Toy
     * @param modelo the model object carrying data
     * @return detailed data about Toy
     */
    public String updateDetailedView(Toy modelo){
        return view.printToyDeets(modelo.getName(), modelo.getPrice(), modelo.getDateReleased());
    }
}
