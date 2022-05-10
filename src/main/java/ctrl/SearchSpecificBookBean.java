/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ctrl;

import bus.SearchBookService;
import ents.books;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author roryj
 */
@Named(value = "searchSpecificBookBean")
@RequestScoped
public class SearchSpecificBookBean {

    @EJB
    private SearchBookService sbs ;
    public SearchSpecificBookBean() {
    }
    private String searchbook;

    public String getSearchbook() {
        return searchbook;
    }

    public void setSearchbook(String searchbook) {
        this.searchbook = searchbook;
    }

    public List<books> getAllSearchedNames() {
        return allSearchedNames;
    }

    public void setAllSearchedNames(List<books> allSearchedNames) {
        this.allSearchedNames = allSearchedNames;
    }
    
    
    
    
    
    
    
    private List<books> allSearchedNames = new ArrayList<>();
    
    public List<books> getSearchedNames() {

        allSearchedNames = this.sbs.searchBookRecords(this.searchbook);
        

        return allSearchedNames;
    } 
}
