package controller;

//import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
//import javax.faces.context.FacesContext;
import javax.faces.context.FacesContext;
 
@ManagedBean
public class userView {
     
    private String firstname;
    private String lastname;
 
    public String getFirstname() {
        return firstname;
    }
 
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void addMessage() {
        String summary = firstname;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }
}