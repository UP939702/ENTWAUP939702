/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package bus;

import ents.books;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.booksFacade;

/**
 *
 * @author roryj
 */
@Stateless
public class SearchBookService {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    @EJB
    private booksFacade bf;
    
    public List<books> searchBookRecords (String name) {
        List<books> returnedBooks = bf.searchForBooks(name);
        System.out.println(returnedBooks + "HERE IS THE BOOK");
        return returnedBooks;
    }
}
