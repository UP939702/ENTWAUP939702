/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import bus.UserService;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author roryj
 */
@Named(value = "searchUserBean")
@RequestScoped
public class SearchUserBean {

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
        System.out.println(this.email + "lolol");
        String acceptUser = this.us.searchRecord(this.email,this.password);
        if (acceptUser != null) {
            System.out.println("log in success");
            return "/start.xhtml?faces-redirect=true";
        } else {
            System.out.println("log in failed");
       
            return "/Login.xhtml?faces-redirect=true";
        }
        
    }
    
}


