/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ents;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author roryj
 */
@Entity
public class orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userEmail;
    private int quantity;                                       // table headings/attributes for each order
    private Long price;
    private int dateO;

    public void setDateO(int dateO) {
        this.dateO = dateO;
    }

    public int getDateO() {
        return dateO;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
                                                                // corresponding getters and setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    
    public String getUserEmail() {
        return userEmail;
    }

    public int getQuantity() {
        return quantity;
    }

    public Long getPrice() {
        return price;
    }

    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof orders)) {
            return false;
        }
        orders other = (orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.orders[ id=" + id + " ]";
    }
    
}
