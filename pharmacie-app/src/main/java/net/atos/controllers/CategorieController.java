/**
 * 
 */
package net.atos.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.atos.domain.Categorie;
import net.atos.domain.request.CategorieRequest;
import net.atos.service.CategorieService;

/**
 * @author A707592
 *
 */
@RestController
@RequestMapping("categories")
public class CategorieController {

	@Autowired
	private CategorieService service;

	@PostMapping
	public ResponseEntity<Categorie> create(@RequestPart("image") MultipartFile image,
			@RequestPart("categorie") String categorie) throws JsonParseException, JsonMappingException, IOException {
		CategorieRequest categorieRequest = new ObjectMapper().readValue(categorie, CategorieRequest.class);
		Categorie c = new Categorie();
		c.setName(categorieRequest.getName());
		return ResponseEntity.ok(service.save(c, image));
	}
}
