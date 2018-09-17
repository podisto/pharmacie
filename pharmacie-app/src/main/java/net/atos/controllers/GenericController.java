/**
 * 
 */
package net.atos.controllers;

import java.net.URI;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.ApiOperation;
import net.atos.domain.BaseEntity;
import net.atos.repositories.BaseDAO;

/**
 * @author A707592
 *
 */
/*@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
		@ApiResponse(code = 201, message = "resource created"), @ApiResponse(code = 400, message = "bad request"),
		@ApiResponse(code = 401, message = "unauthorized"),
		@ApiResponse(code = 403, message = "access denied, not granted to access this resource"),
		@ApiResponse(code = 404, message = "resource not found"), @ApiResponse(code = 500, message = "error server") })*/
@RolesAllowed({"ROLE_ADMIN", "ROLE_SUPER_ADMIN"})
public abstract class GenericController<T extends BaseEntity> {

	@Autowired
	private BaseDAO<T> dao;

	@GetMapping("/all")
	@ApiOperation("get all entities")
	public List<T> getAll() {
		return dao.findAll();
	}

	@GetMapping("/{id}")
	@ApiOperation("find entity")
	public ResponseEntity<T> get(@PathVariable int id) {
		return dao.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping
	@ApiOperation("search entities")
	public Page<T> find(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
			@RequestParam(value = "size", required = false, defaultValue = "20") int size) {
		return dao.findAll(PageRequest.of(page, size));
	}

	@PostMapping
	@ApiOperation("create entity")
	public ResponseEntity<T> create(@RequestBody T entity) {
		T created = dao.save(entity);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(created.getId()).toUri();
		return ResponseEntity.created(location).body(created);
	}

	@PutMapping("/{id}")
	@ApiOperation("update entity")
	public ResponseEntity<T> update(@PathVariable int id, @RequestBody T t) {
		return dao.findById(id).map(target -> {
			BeanUtils.copyProperties(t, target, "id");
			return target;
		}).map(dao::save).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	@ApiOperation("delete entity")
	public ResponseEntity<Object> delete(@PathVariable int id) {
		return dao.findById(id).map(entity -> {
			dao.delete(entity);
			return entity;
		}).map(t -> ResponseEntity.noContent().build()).orElse(ResponseEntity.notFound().build());
	}
}
