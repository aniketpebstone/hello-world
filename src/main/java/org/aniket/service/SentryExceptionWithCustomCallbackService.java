package org.aniket.service;

import org.springframework.stereotype.Service;

@Service
public class SentryExceptionWithCustomCallbackService {

	public void execute()
	{
		throw new RuntimeException("Exception with custom callback!");
	}
}
