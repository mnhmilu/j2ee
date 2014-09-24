/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import enitty.Actor;
import enitty.Employee;
import enitty.Language;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nahid
 */
@Local
public interface MapEJBRemote {

    public String sayHiToRemoteEJB();

    public List<Employee> getAllEmployee();
    
}
