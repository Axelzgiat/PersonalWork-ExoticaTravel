/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.http.*;
import javax.servlet.jsp.PageContext;

/**
 *
 * @author axelzgiat
 */
public class UserNameTagHandler extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            
            PageContext ctx = (PageContext)getJspContext();
            HttpSession session = ctx.getSession();
            String username = session.getAttribute("User").toString();
            out.println("<td><font color='darkblue' size='+1'><a href='LogOutServlet'>Logout "+username+"</a></td>");
           
        } catch (java.io.IOException ex) {
            throw new JspException("Error in UserNameTagHandler tag", ex);
        }
    }
    
}
