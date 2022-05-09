/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import bus.AddUserService;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author roryj
 */
@Named(value = "addUserBean")
@RequestScoped
public class AddUserBean {

    /**
     * Creates a new instance of AddUserBean
     */
    public AddUserBean() {
    }
    
    
    
    private String email;
    private String password;
    private String delivery;
    private String payment;
    private String name;
    
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDelivery() {
        return delivery;
    }

    public String getPayment() {
        return payment;
    }

    public String getName() {
        return name;
    }
   

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    @EJB
    private AddUserService aus;
    
    public String doAddAccount() {
        System.out.println(email + "This account added");
        this.aus.setData(name, email,password,delivery,payment);
   
        return "";
    }
    
}
