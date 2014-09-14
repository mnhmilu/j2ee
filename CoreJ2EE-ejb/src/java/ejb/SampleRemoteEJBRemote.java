/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import enitty.Actor;
import enitty.Language;
import javax.ejb.Remote;

/**
 *
 * @author nahid
 */
@Remote
public interface SampleRemoteEJBRemote {

    public String sayHiToRemoteEJB();

    public void saveActor(Actor actor);
    
    public void saveLanguage(Language language);
    
}
