/**
 * 
 */
package net.atos.app.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import lombok.extern.slf4j.Slf4j;
import net.atos.service.security.JwtTokenUtil;

/**
 * @author A707592
 *
 */
@Slf4j
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

	 @Autowired
	    private UserDetailsService userDetailsService;

	    @Autowired
	    private JwtTokenUtil jwtTokenUtil;

	    @Value("${jwt.header}")
	    private String tokenHeader;

	    @Override
	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
	        
	    }

}
