/**
 * 
 */
package net.atos.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import net.atos.domain.DBFile;
import net.atos.repositories.DBFileDAO;
import net.atos.service.exception.FileStorageException;
import net.atos.service.exception.MyFileNotFoundException;

/**
 * @author A707592
 *
 */
@Service
public class DBFileStorageServiceImpl implements DBFileStorageService {
	
	@Autowired
	private DBFileDAO dao;

	/* (non-Javadoc)
	 * @see net.atos.service.DBFileStorageService#save(org.springframework.web.multipart.MultipartFile)
	 */
	@Override
	public DBFile save(MultipartFile file) {
		// Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes());

            return dao.save(dbFile);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
	}

	/* (non-Javadoc)
	 * @see net.atos.service.DBFileStorageService#getFile(java.lang.String)
	 */
	@Override
	public DBFile getFile(String id) {
		return dao.findById(id)
                .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + id));
	}

}
