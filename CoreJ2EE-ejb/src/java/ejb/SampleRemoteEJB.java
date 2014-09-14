/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import enitty.Actor;
import enitty.Language;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityTransaction;

/**
 *
 * @author nahid
 */
@Stateless
public class SampleRemoteEJB implements SampleRemoteEJBRemote {

    @PersistenceContext(unitName = "CoreJ2EE-ejbPU")
    private EntityManager em;

    @Override
    public String sayHiToRemoteEJB() {
        return "Hi,to Remote Bean";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveActor(Actor actor) {
        try {
            //System.out.println(actor.getActorId());
           // em.getTransaction().begin();
            em.merge(actor);
          //  em.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println("save done");
        }
        System.out.print("Done!");
    }

    @Override
    public void saveLanguage(Language language) {
        em.persist(language);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
