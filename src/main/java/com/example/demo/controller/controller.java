package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

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
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.ReplyMessage;
//import com.example.demo.repository.repository;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.response.BotApiResponse;

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
	  public String hello2(@RequestBody eventwraper events) throws IOException, ExecutionException {	
	String gg=null;
	gg=events.getEvents().get(0).getReplyToken();
	System.out.println("efef");
	System.out.println(events.getEvents().get(0).getReplyToken());
   rep.sett(events.getEvents().get(0).getMessage().getText());
   
//   List<messagee>mesgL=new ArrayList<messagee>();
//   messagee msg =new messagee();
//   msg.setType("text");
//   msg.setText("loveu");
//   mesgL.add(msg);
//   
//   replymessage replm= new replymessage();
//   replm.setMessage(mesgL);
//   replm.setReplyToken(gg);
//     ObjectMapper mapper = new ObjectMapper();
//   String jsonString = mapper.writeValueAsString(replm);
//   
   
    LineMessagingClient client = LineMessagingClient.builder("Q4AFo5nfKYJ8MiHV4uIYVUAAQ668GXP3d7RNL3EtV7p0l6sHkC+mXrZgwIgvcMvTg8ddT90tNHV9eMZ0yaeT48/qDB96YEISC1grArA8S6XbLuLTqPuNo8Kb4rubULYrFr3QBqMSAfFI7UXolz/EbwdB04t89/1O/w1cDnyilFU=").build();

	 TextMessage textMessage = new TextMessage("hello");
	final ReplyMessage replyMessage = new ReplyMessage( gg,textMessage);

	BotApiResponse botApiResponse=null;
	try {
	    botApiResponse = client.replyMessage(replyMessage).get();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	 
	}

	System.out.println(botApiResponse);
   
   
   
   
   
//   jsonString ="{\"replyToken\":\""+gg+"\",\"message\":[{\"type\":\"text\",\"text\":\"hihihihihi\"},{\"type\":\"text\",\"text\":\"ddd\"}]}";
   
//   System.out.println(jsonString);
//   sentpost(jsonString);
	    return(gg); // 根據view resolver mapping至hello.jsp
	  }
		
	
	
	@RequestMapping("/yulun")
  public String hello2(@RequestBody String ff) {
		System.out.println(ff); 
		return(rep.findAll().get(0).getPas());
		 
  // 根據view resolver mapping至hello.jsp
  }
	@RequestMapping("/y")
	  public void ss() {
			sentpost("ss");
			//return(rep.findAll().get(0).getPas());
			 
	  // 根據view resolver mapping至hello.jsp
	  }
		
	
	private void sentpost(String message) 
	{
		
//		try {
//		 String accestoken="{Q4AFo5nfKYJ8MiHV4uIYVUAAQ668GXP3d7RNL3EtV7p0l6sHkC+mXrZgwIgvcMvTg8ddT90tNHV9eMZ0yaeT48/qDB96YEISC1grArA8S6XbLuLTqPuNo8Kb4rubULYrFr3QBqMSAfFI7UXolz/EbwdB04t89/1O/w1cDnyilFU=}";
//	        URL url= new URL("localhost:8080/g/yulun");//"https://api.line.me/v2/bot/message/reply");
//	        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
//
//	        //添加请求头
//	        con.setRequestMethod("POST");
//	        con.setRequestProperty("Content-Type", "application/json");
//	        con.setRequestProperty("Authorization", "Bearer "+accestoken);
//	        con.setRequestProperty("client_secret","a525c635ec4c6f0b26fda36dbb787525");
//	        
//	        con.setDoInput(true);
//	        con.setDoOutput(true);
//
//	        //发送Post请求
//	 System.out.println("sentnttt");
//	        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//	        wr.writeBytes(message);
//	        wr.flush();
//	        wr.close();
//	        System.out.println(con.getContent().toString());
//	        
//	      	 System.out.println("sentntttover");
//		      System.out.println( con.getResponseCode()+"==="+con.getResponseMessage());
//		     
//		}catch (Exception r)
//		{
//			System.out.println(r.toString());
//			System.out.println(r.getMessage());
//		}
//	

	       
	}
}