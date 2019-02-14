/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;


/**
 *
 * @author axelzgiat
 */
public class LoginBean extends org.apache.struts.action.ActionForm 
{
	private String userid,password,r1;

		public LoginBean()
		{
			super();
			//TODO auto-generated constructor stub
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

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }
	
}

