/**
 * 
 */
package net.atos.domain;

import javax.persistence.*;

/**
 * @author A707592
 *
 */
@Entity
@Table(name = "departement")
public class Departement extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nom")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "region_id", referencedColumnName = "id")
	private Region region;
}
