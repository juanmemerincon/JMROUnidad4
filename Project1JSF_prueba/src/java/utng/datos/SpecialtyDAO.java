/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Modulo;
import utng.modelo.Specialty;

/**
 *
 * @author Orlando
 */
public class SpecialtyDAO extends DAO<Specialty> {
    public SpecialtyDAO() {
        super(new Specialty());
    }

    
    public Specialty getOneById(Specialty specialty) throws HibernateException {
        return super.getOneById(specialty.getIdSpecialty()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
