/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pers;

import ents.UserAccounts;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author roryj
 */
@Stateless
public class UserAccountsFacade extends AbstractFacade<UserAccounts> {

    @PersistenceContext(unitName = "bookP")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserAccountsFacade() {
        super(UserAccounts.class);
    }
    
    

    public String searchDBRecord (String email, String password) {
//        System.out.println(email + "hiya");
//        UserAccounts test = em.find(UserAccounts.class, email);
//        Sys
//        return test;
        Query q = em.createNamedQuery("person.logIn");
        q.setParameter("em", email);
        q.setParameter("pw", password);
        try {
            System.out.println(q.getSingleResult() + " :Current user");
            String uSn = q.getSingleResult().toString();
            
            return uSn;
        }catch(Exception e){
            System.out.println("No account");
            return null;
            
        }
        
    } 
    
    
    
    public String searchAdmin (String email) {
        System.out.println(email + "HHHHERRRRRREE LOLOLOLOLOLOL");
        Query q = em.createNamedQuery("person.adminCheck");
        q.setParameter("em", email);
       
        try {
            System.out.println(q.getSingleResult() + " :Current user");
            String uSn = q.getSingleResult().toString();
            
            return uSn;
        }catch(Exception e){
            System.out.println("No account");
            return null;
            
        }
        
    } 
}
