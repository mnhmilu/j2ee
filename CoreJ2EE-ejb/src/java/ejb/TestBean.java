/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author nahid
 */
@Stateless
public class TestBean implements TestBeanLocal {

    @Override
    public String getMessage() {
        return "This Bean for GIT Testing";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
