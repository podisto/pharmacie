/**
 * 
 */
package net.atos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author A707592
 *
 */
@Entity
@Table(name = "categorie")
@Data
@EqualsAndHashCode(callSuper=false)
public class Categorie extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nom")
	private String name;
	
	@OneToOne
	@JoinColumn(name = "image_id", referencedColumnName = "id")
	private DBFile dbFile;
	
}
