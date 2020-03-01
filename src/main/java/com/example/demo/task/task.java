package com.example.demo.task;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class task {
@Scheduled(initialDelay = 1000, fixedDelay = 600000)
void ppp() throws IOException
{
	Document doc = Jsoup.connect("https://salty-forest-88943.herokuapp.com/g/index").get();
	System.out.println(doc.text());
}
}
