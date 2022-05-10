/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pers;

import ents.books;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author roryj
 */
@Stateless  
public class booksFacade extends AbstractFacade<books> {

    @PersistenceContext(unitName = "bookP")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public booksFacade() {
        super(books.class);
    }
//     public List<String> findBookByName(String a) {
//        Query q = em.createNamedQuery("books.findByName");              // Creates the query that will search for a book
//        q.setParameter("name", a);                                      // assigns the passed variable to "name" for the command
//        return q.getResultList();                                       // Uses inbuilt function to return the list of results from db
//    }
    public List<books> searchForBooks (String name) {
        Query q = em.createNamedQuery("books.findByName");
        q.setParameter("name", name);
        List<books> dbReturn = q.getResultList();
        return dbReturn;
        
    }
    
    
    
}
