/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package bus;

import ents.books;
import ents.orders;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.ordersFacade;

/**
 *
 * @author roryj
 */
@Stateless
public class CustomerOrdersService {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
        @EJB
    private ordersFacade of;

    public List<orders> findAllCOrders(String name) {  
        List<orders> returnedOrders = of.searchCustomerOrders(name);                                                      // run the findbook function from the facade book class
        return returnedOrders;                                    // returns the list of books
}
}



