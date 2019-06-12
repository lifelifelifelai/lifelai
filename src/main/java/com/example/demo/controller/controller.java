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
System.out.println(h);
    return("dd"); // 根據view resolver mapping至hello.jsp
  }
	
	@RequestMapping(value="/gg")
	  public String hello2(@RequestBody Event event) {	
	String gg=null;
	System.out.println("efef");
	System.out.println(event);
        Event ee=new Event();
		System.out.println(gg=ee.getReplytoken());
	
	System.out.println("efef");
		rep.sett(gg);
	    return(gg); // 根據view resolver mapping至hello.jsp
	  }
		
	
	
}