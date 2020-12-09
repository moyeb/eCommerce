package com.dt.travelecomm.model;

import java.util.Collection;

import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;

	public class UserDetails {
	

	  @Transient
	  private boolean accountNonExpired = true;
	  @Transient
	  private boolean accountNonLocked = true;
	  @Transient
	  private boolean credentialsNonExpired = true;
	  @Transient
	  private boolean enabled = true;
	  @Transient
	  private Collection<GrantedAuthority> authorities = null;
}
