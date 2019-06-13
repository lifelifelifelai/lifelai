package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

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
import com.example.demo.entity.messagee;
import com.example.demo.entity.replymessage;
import com.example.demo.repository.repository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	  public String hello2(@RequestBody eventwraper events) throws IOException {	
	String gg=null;
	gg=events.getEvents().get(0).getReplyToken();
	System.out.println("efef");
	System.out.println(events.getEvents().get(0).getReplyToken());
   rep.sett(events.getEvents().get(0).getMessage().getText());
   
   List<messagee>mesgL=new ArrayList<messagee>();
   messagee msg =new messagee();
   msg.setType("text");
   msg.setText("loveu");
   mesgL.add(msg);
   
   replymessage replm= new replymessage();
   replm.setMessage(mesgL);
   replm.setReplyToken(gg);
   
  
   
   ObjectMapper mapper = new ObjectMapper();
   String jsonString = mapper.writeValueAsString(replm);
   
   
   jsonString ="{\"replyToken\":\""+gg+"\",\"message\":[{\"type\":\"text\",\"text\":\"hihihihihi\"}]}";
   
   System.out.println(jsonString);
   sentpost(jsonString);
	    return(gg); // 根據view resolver mapping至hello.jsp
	  }
		
	
	
	@RequestMapping("/yulun")
  public String hello2() {
		 return(rep.findAll().get(0).getPas());
  // 根據view resolver mapping至hello.jsp
  }
	
	
	private void sentpost(String message) 
	{
		
		try {
		 String accestoken="vgkScsbgE1PDWqyxdbX3LfnOEod9LyeALuardqhOBk1JPVlPZa2oLdh0eS5Ijn4Eg8ddT90tNHV9eMZ0yaeT48/qDB96YEISC1grArA8S6VNcwqyRgsiw1+c15YjtLsBbaAL0aQJIOL8ZCO1rDLqVAdB04t89/1O/w1cDnyilFU=";
	        URL url= new URL("https://api.line.me/v2/bot/message/reply");
	        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

	        //添加请求头
	        con.setRequestMethod("POST");
	        con.setRequestProperty("Content-Type", "application/json; charset=utf8");
	        con.setRequestProperty("Authorization", "Bearer "+accestoken);
	        
	        con.setDoInput(true);
	        con.setDoOutput(true);

	        //发送Post请求
	 System.out.println("sentnttt");
	        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	        wr.writeBytes(message);
	        wr.flush();
	        wr.close();
	        
	        
	      	 System.out.println("sentntttover");
		      System.out.println( con.getResponseCode()+"==="+con.getResponseMessage());
		     
		}catch (Exception r)
		{
			System.out.println(r.toString());
			System.out.println(r.getMessage());
		}
	

	       
	}
}