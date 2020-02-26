package com.example.schedual;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedualtask {
	@Scheduled(fixedRate = 600000, initialDelay = 1000)
	public void qqq()
	{
		System.out.println("notdying");
		
	}
	

}
