package exoticatravels;

import org.apache.struts.action.ActionServlet;
import org.apache.struts.upload.MultipartRequestHandler;

/**
 *
 * @author axelzgiat
 */
public class RegistrationBean extends org.apache.struts.action.ActionForm 
{
	private String username,userid,password,reenterpassword,address,state,country;

	public RegistrationBean()
	{
		super();
		//TODO auto-generated consturctor stub
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReenterpassword() {
        return reenterpassword;
    }

    public void setReenterpassword(String reenterpassword) {
        this.reenterpassword = reenterpassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}