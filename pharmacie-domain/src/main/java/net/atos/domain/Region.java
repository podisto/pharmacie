/**
 * 
 */
package net.atos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author A707592
 *
 */
@Entity
@Table(name = "region")
@Data
public class Region extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nom")
	private String name;

}
