/**
 * 
 */
package net.atos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.domain.DBFile;

/**
 * @author A707592
 *
 */
@Repository
public interface DBFileDAO extends JpaRepository<DBFile, String> {

}
