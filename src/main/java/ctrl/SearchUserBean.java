/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import bus.UserService;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Remove;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

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
    

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
//    
//    public String doFindAccount(String email) {
//        String account = us.doesUserExist(email);
//        return account;
//    }

    
    public String logInCheck() {

        String acceptUser = this.us.searchRecord(this.email,this.password);
        if (acceptUser != null) {
            logIn(acceptUser);
            System.out.println("log in success");
            return "/start.xhtml?faces-redirect=true";
        } else {
            System.out.println("log in failed");
       
            return "/Login.xhtml?faces-redirect=true";
        }
        
    }
    private String activeUser;


    public String logIn(String user) {
        this.activeUser = user;
        return "";
    }

    public String logOut() {
        activeUser = null;
    
        return "/Login.xhtml?faces-redirect=true";
        
    }

    public boolean isLoggedIn() {
        return activeUser != null;
    }

    public String getActiveUser() {
        return activeUser;
    }
 

    
}


