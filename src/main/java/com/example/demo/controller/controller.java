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
  public account hello() {
	System.out.println("sss");
		List<account> gg=new ArrayList<account>();
	gg=	rep.findAll();
	System.out.println(gg.size());
	System.out.println(gg.get(0).getAc());
    return(gg.get(0)); // 根據view resolver mapping至hello.jsp
  }
	
	@RequestMapping(value="/gg")
	  public String hello2(@RequestBody eventwraper events) {	
	String gg=null;
	System.out.println("efef");
	for (Event event:events.getEvents())
	{
		System.out.println(gg=event.getReplytoken());
	}
	System.out.println("efef");
		rep.sett(gg);
	    return(gg); // 根據view resolver mapping至hello.jsp
	  }
		
	
	
}