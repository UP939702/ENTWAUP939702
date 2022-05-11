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

    @EJB
    private booksFacade bf;

    /**
     *
     * @param name
     * @return
     */
    public List<books> searchBookRecords(String name) {
        List<books> returnedBooks = bf.searchForBooks(name);            //Searches for book then returns relevant results in a list
        return returnedBooks;
    }
}
