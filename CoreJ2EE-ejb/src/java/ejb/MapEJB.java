/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import enitty.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nahid.hossain
 */

@Stateless
public class MapEJB implements MapEJBRemote{
    @PersistenceContext(unitName = "CoreJ2EE-ejbPU2")
    private EntityManager em;   

    @Override
    public String sayHiToRemoteEJB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public List<Employee> getAllEmployee() {
        
           List<Employee> results= new ArrayList<>();
           Query query =  this.em.createNamedQuery("Employee.findAll");               
           results=(List<Employee>) query.getResultList();
           System.out.println(results.toString());         
           return results;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void persist(Object object) {
        em.persist(object);
    }
    
}
