/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import enitty.Actor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nahid
 */
@Stateless
public class TestBean implements TestBeanLocal {
    @PersistenceContext(unitName = "CoreJ2EE-ejbPU")
    private EntityManager em;

    @Override
    public String getMessage() {
        return "This Bean for GIT Testing";
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public void saveActor(Actor actor) {
        
        em.persist(actor);
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
