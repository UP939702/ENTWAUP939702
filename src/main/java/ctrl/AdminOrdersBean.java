/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import bus.AdminOrdersService;
import bus.CustomerOrdersService;
import ents.orders;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author roryj
 */
@Named(value = "adminOrdersBean")
@Dependent
public class AdminOrdersBean {

    @EJB
    private AdminOrdersService aos;

    /**
     * Creates a new instance of AdminOrdersBean
     */
    public AdminOrdersBean() {
    }

    private List<orders> allOrders = new ArrayList<>();

    public List<orders> getAllOrders() {

        allOrders = aos.findAllOrders();                 // Gets all of the admin orders and returns them

        return allOrders;
    }

}
