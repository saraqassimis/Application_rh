/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Societe;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sara
 */
@Local
public interface SocieteFacadeLocal {

    void create(Societe societe);

    void edit(Societe societe);

    void remove(Societe societe);

    Societe find(Object id);

    List<Societe> findAll();

    List<Societe> findRange(int[] range);

    int count();
    
}
