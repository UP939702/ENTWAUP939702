/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import bus.CustomerOrdersService;
import bus.UserService;
import ents.UserAccounts;
import ents.orders;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author roryj
 */
@Named(value = "searchUserBean")

@SessionScoped
public class SearchUserBean implements Serializable{

    /**
     * Creates a new instance of SearchUserBean
     */
    @EJB
    private UserService us;
    public SearchUserBean() {
    }
    private String email;
    private String password;
    
    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     *
     * @return
     */
    public String logInCheck() {

        UserAccounts acceptUser = this.us.searchRecord(this.email,this.password);
        if (acceptUser != null) {
            logIn(acceptUser.getEmail());
            System.out.println("log in success");
            return "/allBooks.xhtml?faces-redirect=true";
        } else {
            System.out.println("log in failed");
       
            return "/Login.xhtml?faces-redirect=true";
        }
        
    }
    private String activeUser;
  
    /**
     *
     * @param user
     * @return
     */
    public String logIn(String user) {
       
        
        this.activeUser = user;
        return "";
    }

    /**
     *
     * @return
     */
    public String logOut() {
        activeUser = null;
    
        return "/Login.xhtml?faces-redirect=true";
        
    }

    /**
     *
     * @return
     */
    public boolean isLoggedIn() {
        return activeUser != null;
    }

    /**
     *
     * @return
     */
    public String getActiveUser() {
        return activeUser;
    }
    
    public String adminOrders() {
        
       
        if ((us.searchRecord(activeUser, password)).getAdmin() == true){
            return "true";
        }else{
            return "false";
        }
        
    }
    @EJB
    private CustomerOrdersService cos;
    /**
     * Creates a new instance of CustomerOrdersBean
     */
  
    
    private List<orders> allCOrders = new ArrayList<>();
    
    public List<orders> getAllCOrders() {

        allCOrders = cos.findAllCOrders(activeUser);                 // Uses the sb object to then query all of the books in the db

        return allCOrders;
    }
 

    
}


