package managedBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import entities.User;
import services.BasicOpsServiceLocal;

@ManagedBean
public class UserManagementBean {

	public UserManagementBean() {
		// TODO Auto-generated constructor stub
	}

	private String name;
	private String login;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@EJB
	BasicOpsServiceLocal bosl;
	
	public void doAddUser(){
		
		User u = new User();
		u.setName(name);
		u.setLogin(login);
		u.setPassword(password);
		
		bosl.saveOrUpdateUser(u);
	}
}
