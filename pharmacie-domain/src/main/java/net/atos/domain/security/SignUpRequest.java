/**
 * 
 */
package net.atos.domain.security;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * @author A707592
 *
 */
@Data
public class SignUpRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
    @Size(min = 4, max = 40)
    private String firstname;
	
	@NotBlank
    @Size(min = 4, max = 40)
    private String lastname;

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;
    
    private boolean enabled;
}
