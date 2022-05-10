/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import bus.searchB;
import ents.books;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


/**
 *
 * @author roryj
 */
@Named(value = "searchBookBean")
@RequestScoped
public class SearchBookBean {

 
    @EJB
    private searchB sb;                     // Creates new searchBeasn object called "sb"
    public SearchBookBean() {
    }
   
   
    
    
    
    private List<books> allBookNames = new ArrayList<>();     //Creates list of books that should be passed into the JSF page
    
    public List<books> getAllBookNames() {

        allBookNames = sb.findAllBookNames();                 // Uses the sb object to then query all of the books in the db
          
        return allBookNames;
    }

}

