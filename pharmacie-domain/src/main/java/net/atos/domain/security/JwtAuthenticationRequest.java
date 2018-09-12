/**
 * 
 */
package net.atos.domain.security;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author A707592
 *
 */
@Data
@AllArgsConstructor
public class JwtAuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	@Size(min = 3, message = "username should be at least 5 characters")
	private String username;
	
	@NotBlank
	@Size(min = 5, message = "password should be at least 5 characters")
	private String password;
}
