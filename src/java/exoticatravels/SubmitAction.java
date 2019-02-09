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

/**
 *
 * @author axelzgiat
 */
public class SubmitAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String NewUser = "newuser";
    private static final String ExistingUser = "existinguser";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        HomePageBean hb = (HomePageBean)form;
        String str1=hb.getR1();
        if(str1.equals("newuser"))
        {
            return mapping.findForward(NewUser);
        } else
        return mapping.findForward(ExistingUser);
    }
}
