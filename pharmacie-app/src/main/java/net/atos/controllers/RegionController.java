/**
 * 
 */
package net.atos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import net.atos.domain.Region;

/**
 * @author A707592
 *
 */
@RestController
@RequestMapping("/regions")
@Api(value = "regions", tags = {"Parametrages"})
public class RegionController extends GenericController<Region> {
}
