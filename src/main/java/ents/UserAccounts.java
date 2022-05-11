/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ents;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author roryj
 */
@Entity

@NamedQuery(name = "person.logIn", 
        query = "SELECT u.email FROM UserAccounts u WHERE u.email LIKE :em AND u.password LIKE :pw")



@NamedQuery(name = "admin.adminCheck", 
        query = "SELECT u.admin FROM UserAccounts u WHERE u.email LIKE :em ")




public class UserAccounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String lastDeliveryAdress;                                  // table headings/attributes for each user
    private String lastPaymentInfo;
    private Date lastLoggedIn;
    private Boolean admin;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
                                                                        // corresponding getters and setters
    public String getLastDeliveryAdress() {
        return lastDeliveryAdress;
    }

    public String getLastPaymentInfo() {
        return lastPaymentInfo;
    }

    public Date getLastLoggedIn() {
        return lastLoggedIn;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastDeliveryAdress(String lastDeliveryAdress) {
        this.lastDeliveryAdress = lastDeliveryAdress;
    }

    public void setLastPaymentInfo(String lastPaymentInfo) {
        this.lastPaymentInfo = lastPaymentInfo;
    }

    public void setLastLoggedIn(Date lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
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
        if (!(object instanceof UserAccounts)) {
            return false;
        }
        UserAccounts other = (UserAccounts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ents.user[ id=" + id + " ]";
    }
    
}
