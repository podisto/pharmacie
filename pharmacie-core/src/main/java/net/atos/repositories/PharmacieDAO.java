/**
 * 
 */
package net.atos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.domain.Pharmacie;

/**
 * @author A707592
 *
 */
@Repository
public interface PharmacieDAO extends JpaRepository<Pharmacie, Integer> {

}
