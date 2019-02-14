/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpSession;

/**
 *
 * @author axelzgiat
 */
public class ValidateAction extends org.apache.struts.action.Action {

    private static final String WelcomeAdmin = "admin";
    private static final String WelcomeCustomer = "customer";
    private static final String Error = "error";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception{
            LoginBean lb = (LoginBean)form;
            String userid=lb.getUserid();
            String password=lb.getPassword();
            String role=lb.getR1();
            if(userid.equals("admin")&& password.equals("password123")&& role.equals("administrator"))
            {
                HttpSession session =request.getSession();
                session.setAttribute("User",userid);
                return mapping.findForward(WelcomeAdmin);
            }
            else {
                if (userid.equals("user")&& password.equals("user123")&& role.equals("customer"))
                {
                    HttpSession session = request.getSession();
                    session.setAttribute("User",userid);
                    return mapping.findForward(WelcomeCustomer);
                    
                } 
                else
                {
                    return mapping.findForward(Error);
                }
            }}}
    
