/**
 * 
 */
package net.atos.service;

import org.springframework.web.multipart.MultipartFile;

import net.atos.domain.DBFile;

/**
 * @author A707592
 *
 */
public interface DBFileStorageService {
	DBFile save(MultipartFile file);
	
	DBFile getFile(String id);
}
