/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import bus.NewOrderService;
import ents.books;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author roryj
 */
@Named(value = "addToBasketBean")
@SessionScoped
public class AddToBasketBean implements Serializable{

    /**
     * Creates a new instance of AddToBasketBean
     */
    public AddToBasketBean() {
    }
    
    private String delivery;
    private String payment;
    private String email;

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
 
    public List<books> showBasket() {
        return basket;
    }
    
    public void removeFromBasket(books b) {
        basket.remove(b);
       
    }
    public double total() {
        double total = 0;
        for(books b : this.basket) {
            total += b.getPrice();
        }
        return total;
    }  
    private final List<books> basket = new ArrayList<>(); 
    
    public void addToBasket(books b) {
        basket.add(b);
        System.out.println(basket);
    }
    
    @EJB
    private NewOrderService nos;
    public void cO() {
        double total = total();
      
        String uniqueID = UUID.randomUUID().toString();
        this.nos.newOrder(delivery, payment, email, total, uniqueID);
//       
//        System.out.println(hope.getActiveUser() + "This is the user");
//        String thislll = SearchUserBean.getActiveUser();

    }
    
}
