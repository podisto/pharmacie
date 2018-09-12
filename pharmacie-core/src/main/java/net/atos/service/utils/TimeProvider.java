/**
 * 
 */
package net.atos.service.utils;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * @author A707592
 *
 */
@Component
public class TimeProvider implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Date now() {
		return new Date();
	}
}
