/**
 * 
 */
package net.atos.domain;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

/**
 * @author A707592
 *
 */
@Entity
@Table(name = "pharmacie")
@Data
public class Pharmacie implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

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
