/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import ents.books;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    
    private List<books> basket = new ArrayList<>(); 
    
    public void addToBasket(books b) {
        basket.add(b);
        System.out.println(basket);
    }
    
    
}
