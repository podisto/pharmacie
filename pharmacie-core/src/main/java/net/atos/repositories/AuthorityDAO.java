/**
 * 
 */
package net.atos.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.domain.security.Authority;
import net.atos.domain.security.AuthorityName;

/**
 * @author A707592
 *
 */
@Repository
public interface AuthorityDAO extends JpaRepository<Authority, Integer> {
	Optional<Authority> findByName(AuthorityName roleName);
}
