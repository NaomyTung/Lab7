package ca.sait.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ca.sait.models.Role;
import ca.sait.models.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
/**
 *
 * @author Alex Tompkins - 821984
 */
public class RoleDB {
    public List<Role> getAll() throws Exception {
        EntityManagerFactory emFactory = DBUtil.getEmFactory();
        
        EntityManager em = emFactory.createEntityManager();
        
        return em.createNamedQuery("Role.findAll", Role.class).getResultList();
    }
}
