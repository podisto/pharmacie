/**
 * 
 */
package net.atos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import net.atos.domain.Categorie;
import net.atos.repositories.CategorieDAO;

/**
 * @author A707592
 *
 */
@Service
public class CategorieServiceImpl implements CategorieService {
	
	@Autowired
	private CategorieDAO dao;
	@Autowired
	private DBFileStorageService storageService;

	@Override
	public Categorie save(Categorie categorie, MultipartFile file) {
		categorie.setDbFile(storageService.save(file));
		return dao.save(categorie);
	}

}
