/**
 * 
 */
package net.atos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.domain.Categorie;

/**
 * @author A707592
 *
 */
@Repository
public interface CategorieDAO extends JpaRepository<Categorie, Integer> {
	
}
