package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Event;
import com.example.demo.entity.account;
import com.example.demo.entity.eventwraper;
import com.example.demo.repository.repository;
//import com.example.demo.repository.repository;

@RestController
@RequestMapping("/g")
public class controller {

	@Autowired
	repository rep;
	
	
	@RequestMapping("/greeting")
  public String hello(@RequestBody String h) {
		String kk=null;
		System.out.println(h.indexOf("\"text\":\""+8)+"...."+h.indexOf("\"}}],"));
System.out.println(kk=h.substring(h.indexOf(",\"text\"")+9, h.indexOf("\"}}],")));
rep.sett(kk);
    return("dd"); // 根據view resolver mapping至hello.jsp
  }
	
	@RequestMapping(value="/gg")
	  public String hello2(@RequestBody eventwraper events) {	
	String gg=null;
	events.getEvents().get(0).getReplytoken();
	System.out.println("efef");
	System.out.println(events.getEvents().get(0).getReplytoken());
   
		System.out.println(gg=events.getEvents().get(0).getReplytoken());
	
	System.out.println("efef");
		rep.sett(gg);
	    return(gg); // 根據view resolver mapping至hello.jsp
	  }
		
	
	
	@RequestMapping("/yulun")
  public String hello1() {
		 return(rep.findAll().get(0).getPas());
  // 根據view resolver mapping至hello.jsp
  }
	
}