/**
 * 
 */
package net.atos.domain.security;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author A707592
 *
 */
@AllArgsConstructor
@Data
public class JwtAuthenticationResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private final String token;
}
