package net.atos.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.domain.Region;

/**
 * 
 */

/**
 * @author A707592
 *
 */
@Repository
public interface RegionDAO extends JpaRepository<Region, Integer> {

}
