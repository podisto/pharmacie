/**
 * 
 */
package net.atos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.domain.security.User;

/**
 * @author A707592
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
