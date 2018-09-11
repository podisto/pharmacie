/**
 * 
 */
package net.atos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author A707592
 *
 */
@Entity
@Table(name = "region")
public class Region extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nom")
	private String name;

}
