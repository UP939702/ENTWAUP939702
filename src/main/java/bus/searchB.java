/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package bus;

import ents.books;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.UserAccountsFacade;
import pers.booksFacade;

/**
 *
 * @author roryj
 */
@Stateless
public class searchB {
   
    @EJB
    private booksFacade bf;         //creates "bookFacades object for manipulation
    @EJB
    private UserAccountsFacade uaf;
    
    /**
     *
     * @return
     */
    public List<books> findAllBookNames() {  
                                                      // run the findbook function from the facade book class
        return bf.findAll();                                    // returns the list of books
   }
   

}
