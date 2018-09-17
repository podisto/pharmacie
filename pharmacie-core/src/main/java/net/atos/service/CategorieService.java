/**
 * 
 */
package net.atos.service;

import org.springframework.web.multipart.MultipartFile;

import net.atos.domain.Categorie;

/**
 * @author A707592
 *
 */
public interface CategorieService {
	Categorie save(Categorie categorie, MultipartFile file);
}
