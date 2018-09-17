/**
 * 
 */
package net.atos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import net.atos.domain.Departement;

/**
 * @author A707592
 *
 */
@RestController
@RequestMapping("/departements")
@Api(value = "departements", tags = {"Parametrages"})
public class DepartementController extends GenericController<Departement> {
}
