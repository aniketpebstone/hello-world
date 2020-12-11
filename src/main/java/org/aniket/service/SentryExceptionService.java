package org.aniket.service;

import org.springframework.stereotype.Service;

@Service
public class SentryExceptionService {

	public void execute()
	{
		throw new RuntimeException("Simple Exception!");
	}
}
