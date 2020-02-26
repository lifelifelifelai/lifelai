package com.example.schedual;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedualtask {
	@Scheduled(fixedRate = 5000, initialDelay = 1000)
	public void qqq()
	{
		
		
	}
	

}
