
package station;

import javafx.application.Application;
import javafx.stage.Stage;

public class Station extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    

    @Override
    public void start(Stage primaryStage) throws Exception { 
        primaryStage.setTitle("Bus Station");
        ChoseUser choseUser = new ChoseUser(primaryStage);
        Customers customer = new Customers(primaryStage);
        CheckInfoCustomer checkInfoCustomer = new CheckInfoCustomer(primaryStage);
        
        choseUser.prepareScene(); // it calls the method that has the secne
        checkInfoCustomer.prepareScene();
        customer.prepareScene();
        
        choseUser.setcheckinfocustomer(checkInfoCustomer);
        
        checkInfoCustomer.setCustomers(customer);
        //checkInfoEmployee.setEmployee(employee);
       
       
        primaryStage.setScene(choseUser.getScene()); // it will take the scene of the checkinfo , checkinfo should have getscen
       
       // primaryStage.setScene(checkInfoCustomer.getScene()); // it will take the scene of the checkinfo , checkinfo should have getscen
       
        primaryStage.show(); 
    }

}