/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pers;

import ents.books;
import ents.orders;
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
public class ordersFacade extends AbstractFacade<orders> {

    @PersistenceContext(unitName = "bookP")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ordersFacade() {
        super(orders.class);
    }
    public List<orders> searchCustomerOrders (String name) {
        Query q = em.createNamedQuery("orders.findByName");
        q.setParameter("name", name);
        List<orders> dbReturn = q.getResultList();
        return dbReturn;
        
    }
    
}
