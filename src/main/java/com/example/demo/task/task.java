package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class task {
@Scheduled(initialDelay = 1000, fixedDelay = 600000)
void ppp()
{
	System.out.println("checkdying");
}
}
