/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import enitty.Actor;
import javax.ejb.Local;

/**
 *
 * @author nahid
 */
@Local
public interface TestBeanLocal {
    
    public String getMessage();    
    public void saveActor(Actor actor);
    
}
