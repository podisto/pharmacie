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
@Table(name = "pharmacie")
public class Pharmacie extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "nom", unique = true)
	private String name;
	
	@Column(name = "telephone", unique = true)
	private String telephone;
	
	@Column(name = "adresse")
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "departement_id", referencedColumnName = "id")
	private Departement departement;

}
