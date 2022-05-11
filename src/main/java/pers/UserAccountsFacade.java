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

    public UserAccounts searchDBRecord(String email, String password) {
//        System.out.println(email + "hiya");
//        UserAccounts test = em.find(UserAccounts.class, email);
//        Sys
//        return test;
        Query q = em.createNamedQuery("person.logIn");
        q.setParameter("em", email);
        q.setParameter("pw", password);
        try {
            System.out.println(q.getSingleResult() + " :Current user");
            UserAccounts uSn = (UserAccounts) q.getSingleResult();

            return uSn;
        } catch (Exception e) {
            System.out.println("No account");
            return null;

        }

    }

}
