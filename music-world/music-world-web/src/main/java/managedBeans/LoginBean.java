package managedBeans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import entities.User;
import services.BasicOpsServiceLocal;

@ManagedBean(name="identity")
@SessionScoped
public class LoginBean implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//javax.faces.bean
	
	
	
	
	private User u =new User();
	private boolean isLogged=false;
	//dependency injection
	@EJB
	private BasicOpsServiceLocal BOL;
	
	// do+methodName : service recall
	public String dogetUserByLoginAndPassword(){
		
		String navigateTo = "welcome?faces-redirect=true";
		u = BOL.getUserByLogin(
				u.getLogin(), u.getPassword());
		if (u==null){
			
			navigateTo = "error?faces-redirect=true";
		}
		
		isLogged=true;
		
		return navigateTo;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	public String doLogout(){
		isLogged=false;
		
		FacesContext.getCurrentInstance()
		.getExternalContext().invalidateSession();
		return "index?faces-redirect=true";
	}
	
}
