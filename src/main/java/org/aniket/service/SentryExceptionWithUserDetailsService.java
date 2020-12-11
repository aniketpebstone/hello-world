package org.aniket.service;

import org.springframework.stereotype.Service;

@Service
public class SentryExceptionWithUserDetailsService {

	public void execute()
	{
		throw new RuntimeException("Exception with user details!");
	}
}
