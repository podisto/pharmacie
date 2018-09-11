package net.atos.controllers;
/**
 * 
 */

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.atos.domain.Pharmacie;
import net.atos.repositories.PharmacieDAO;

/**
 * @author A707592
 *
 */
@RestController
@RequestMapping("/pharmacies")
@Api(value = "Pharmacies")
public class PharmacieController {
	
	@Autowired
	private PharmacieDAO dao;
	
	@GetMapping
	@ApiOperation("recherche pharmacies")
	public Page<Pharmacie> find(@RequestParam(name = "page", required=false, defaultValue="0") int page, 
			@RequestParam(name = "size", required=false, defaultValue="20") int size) {
		return dao.findAll(PageRequest.of(page, size));
	}
	
	@GetMapping("/{id}")
	@ApiOperation("details")
	public ResponseEntity<Pharmacie> get(@PathVariable int id) {
		return dao.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ApiOperation("create pharmacie")
	public ResponseEntity<Pharmacie> create(@RequestBody Pharmacie pharmacie) {
		Pharmacie created = dao.save(pharmacie);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(created.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
