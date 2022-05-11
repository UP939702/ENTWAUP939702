/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package bus;

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
public class AdminOrdersService {

    @EJB
    private ordersFacade of;

    public List<orders> findAllOrders() {  
                                                      // run the findbook function from the facade book class
        return of.findAll();                                    // returns the list of books
}
    
}
