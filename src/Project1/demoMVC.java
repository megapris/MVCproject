package Project1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;

import layout.TableLayout;

public class demoMVC implements ActionListener{
        /**Label array to store product names */
            String label[];
        /** Button array to click on products */
            JButton button[];
        /** Text Areas to display messages based on UI */
            JTextArea message;
            JTextArea picture;
        /** Toy products (they had to be manually created, since there is no database) */
            Toy toy0, toy1, toy2, toy3, toy4, toy5;
        /** Model of type toy to run on MVC desing */
            Toy model;
        /** View of type ToyView to run on MVC desing */
            ToyView view;
        /** Controller to run on MVC desing */
            ToyController controller;
        /** Integer to keep track of which image of picture is being displayed */
            int productDisplayed;
        /** Button for user to see the product picture */
        JButton prodPicture;
    
    public demoMVC() {
        // Creates a new Frame
            JFrame frame = new JFrame("Toy Store!");
            frame.setSize(950, 950);
            double size[][] = {{10*2, 75*2, 75*2, 75*2, 75*2, 75*2, 10*2}, // Columns
                {10*2, 75*2, 75*2, 75*2, 75*2, 75*2, 10*2}}; // Rows
            frame.setLayout(new TableLayout(size));
        // Initializing label object
            label = new String[7];
        // Initializing buttons
            button = new JButton[7];
            prodPicture = new JButton("View picture");
        // Initiali model will be with toy 0
            model = retrieveToyFromDatabase(0);
        // Instantiating view and controller objects
            view = new ToyView();
            controller = new ToyController(model, view);

        // Set prodPicture to 0
            productDisplayed = 0;
        

        // Placing labels on buttons

        for(int i = 0; i < 6; i++){
            model = retrieveToyFromDatabase(i);
            //label[i]= model.getName();
            label[i]=controller.updateView(model);
        }


        // creating buttons        
            for (int i = 0; i < label.length; i++) {
                button[i] = new JButton(label[i]);
            }
        // Defining Text Area to display product details
            message = new JTextArea(10,20);
            message.setText("Welcome to the Store! \nClick on a Prodcut \nto know more!");
            frame.add(message, "2,5");

        // Placing buttons on frame
            frame.add(button[0], "1,1");
            frame.add(button[1], "3, 1");
            frame.add(button[2], "5, 1");
            frame.add(button[3], "1, 3");
            frame.add(button[4], "3, 3");
            frame.add(button[5], "5, 3");

        // Placing image button on frame
            frame.add(prodPicture, "5, 5");

        // Creating text area to show picture
            picture = new JTextArea(10,20);
            frame.add(picture, "4, 5");




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



        //Adding button listeners
            for(int i =0; i < 6; i++)
                button[i].addActionListener(this);
            prodPicture.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object comp = e.getSource();
        if(comp == button[0]){
            message.setText(controller.updateDetailedView(toy0));
            productDisplayed = 0;
        }
        if(comp == button[1]){
            message.setText(controller.updateDetailedView(toy1));
            productDisplayed = 1;
        }
        if(comp == button[2]){
            message.setText(controller.updateDetailedView(toy2));
            productDisplayed = 2;
        }
        if(comp == button[3]){
            message.setText(controller.updateDetailedView(toy3));
            productDisplayed = 3;
        }
        if(comp == button[4]){
            message.setText(controller.updateDetailedView(toy4));
            productDisplayed = 4;
        }
        if(comp == button[5]){
            message.setText(controller.updateDetailedView(toy5));
            productDisplayed = 5;
        }
        if(comp == prodPicture){
 
            picture.setText("product" +productDisplayed+ " pic");
   
            
            

        }
    }

    public Toy retrieveToyFromDatabase(int prodNum){
        //Manually generating toys for database
            toy0 = new Toy();
            toy0.setName("LEGO set");
            toy0.setPrice(500);
            toy0.setDateReleased(2005);

            toy1 = new Toy();
            toy1.setName("Arduino");
            toy1.setPrice(550);
            toy1.setDateReleased(2010);  

            toy2 = new Toy();
            toy2.setName("Car");
            toy2.setPrice(20);
            toy2.setDateReleased(2000);

            toy3 = new Toy();
            toy3.setName("Puzzle");
            toy3.setPrice(50);
            toy3.setDateReleased(2015);

            toy4 = new Toy();
            toy4.setName("Rubik's Cube");
            toy4.setPrice(90);
            toy4.setDateReleased(1995);

            toy5 = new Toy();
            toy5.setName("Lab set");
            toy5.setPrice(1000);
            toy5.setDateReleased(2020);



        // Switch case to determine which product to return based on parameter
            switch(prodNum){
                case 0: return toy0;
                case 1: return toy1;
                case 2: return toy2;
                case 3: return toy3;
                case 4: return toy4;
                case 5: return toy5;
            }

        return null;
    }


    public static void main (String[] args){
        new demoMVC();
    }
}