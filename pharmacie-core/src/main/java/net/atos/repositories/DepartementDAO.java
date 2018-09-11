/**
 * 
 */
package net.atos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.domain.Departement;

/**
 * @author A707592
 *
 */
@Repository
public interface DepartementDAO extends JpaRepository<Departement, Integer> {

}
