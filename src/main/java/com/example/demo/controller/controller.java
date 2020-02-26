package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
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
import com.example.demo.entity.status;
import com.example.demo.repository.repository;
import com.example.demo.repository.repositorystatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.ReplyMessage;
//import com.example.demo.repository.repository;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.response.BotApiResponse;

@RestController
@RequestMapping("/g")
public class controller {

	@Autowired
	repository rep;
	@Autowired
	repositorystatus rep2;
	
	
//	@RequestMapping("/greeting")
//  public String hello(@RequestBody String h) {
//		String kk=null;
//		System.out.println(h.indexOf("\"text\":\""+8)+"...."+h.indexOf("\"}}],"));
//System.out.println(kk=h.substring(h.indexOf(",\"text\"")+9, h.indexOf("\"}}],")));
////rep.sett(kk);
//    return("dd"); // 根據view resolver mapping至hello.jsp
//  }
//	
	@RequestMapping(value="/gg")
	  public String hello2(@RequestBody eventwraper events) throws IOException, ExecutionException {	
	String gg=null;
	  LineMessagingClient client = LineMessagingClient.builder("siyTXOs4UvFs4axEaIzKNPwfKupC0vWU3gC0ij7+vCHtX5gDgHe/5L8uIBaYHj0/wYE0iLP0ibgCv7m83ZBxhI9t06UVMDlNe7qx8xs/SSMnLnF6FnVPES2aEJBrWpMEJKDxKy+rhKOWYeTRiYP7/QdB04t89/1O/w1cDnyilFU=").build();
	  SimpleDateFormat smd =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
	  Date date =new Date();
	//  System.out.println();
	  String nowtime=smd.format(date);
	 int qq2=1+(int)( Math.random()*100);
	gg=events.getEvents().get(0).getReplyToken();

	String ggf;
	ggf=events.getEvents().get(0).getMessage().getText();
	String replymsg="";
	String statusnow="";
 	statusnow=rep2.status();

 
  // String [] uu= {"寶貝我最愛妳了","綸綸是我的公主","綸綸是我的女神",events.getEvents().get(0).getMessage().getText(),"沒有不學妳，笨笨"};
   String [] uu1= {"真的嗎??","想妳","無此資料","不學你惹~",events.getEvents().get(0).getMessage().getText()
		   ,events.getEvents().get(0).getMessage().getText(),events.getEvents().get(0).getMessage().getText(),"好的"
		   ,"可以打'開始'進入問答模式","怎麼會這樣","可以打'開始'進入問答模式"
   
   };
  
    
    
//    if((ggf.indexOf("喜歡妳")!=-1)||(ggf.indexOf("愛妳")!=-1)||(ggf.indexOf("想妳")!=-1)
//    		||(ggf.indexOf("喜歡你")!=-1)||(ggf.indexOf("愛你")!=-1)||(ggf.indexOf("想你")!=-1)||(ggf.indexOf("抱抱")!=-1)) {
//    	
//    	replymsg="聰明的妳已開啟隱藏劇情總共有四個數字題，首先第一個問題0~9選一個數字";
//    	rep2.sett("4");
//    }
//   else if (statusnow.equals("0"))
//{
//	//沒事狀太
//	   if((ggf.indexOf("開始")!=-1))
//	   {
//		   int ii=(int)( Math.random()*100);
//		   if(ii>33 &&ii<67) {
//			  replymsg="開始問答闖關瞜!!第一題，妳知道一年中總共有幾個情人節可以慶祝呢?(若要退出請打離開)";
//		   }else if (ii<=33) {
//		   replymsg="開始問答闖關瞜!!第一題，全世界中過最多情人節的是哪個國家?(若要退出請打離開)";
//		   }else {
//			   replymsg="開始問答闖關瞜!!第一題，情人節其實是在公元496年開始訂立的，那情人節的前身是甚麼節日呢?(若要退出請打離開)";
//		   }
//		   rep2.sett("1");
//	   }else if ((ggf.indexOf("天氣")!=-1)&&(ggf.indexOf("台北")!=-1))
//	   {
//		   replymsg="今日內湖天氣不佳";
//	   }else if((ggf.indexOf("天氣")!=-1))
//	   {
//		   replymsg="今日新竹晚點可能會下雨請多加留意";
//	   }else if ((ggf.indexOf("是誰")!=-1)||(ggf.indexOf("是什")!=-1))
//	   {
//		   replymsg="我是life_devil_bot出生於20200214，其實原本應該是要放有惡魔角的照片地說，可是我的創造者覺得太羞恥就作罷了";
//	   }else if ((ggf.indexOf("拼圖")!=-1)||(ggf.indexOf("目標")!=-1))
//	   {
//		   replymsg="找到拼圖是這個bot的目標~";
//	   }else if ((ggf.indexOf("隱藏")!=-1))
//	   {
//		   replymsg="隱藏模式需要不一樣的感受";
//	   }else if ((ggf.indexOf("不理")!=-1))
//	   {
//		   replymsg="可以不理我，不要不理life吶";
//	   }else if ((ggf.indexOf("可愛")!=-1)||(ggf.indexOf("笨")!=-1)||(ggf.indexOf("87")!=-1))
//	   {
//		   replymsg="書岑聰明又可愛";
//	   }else if ((ggf.indexOf("雲林")!=-1))
//	   {
//		   replymsg="雲林是個中部的好地方";
//	   }else if ((ggf.indexOf("住哪")!=-1)||(ggf.indexOf("住在")!=-1))
//	   {
//		   replymsg="我住在內湖國小對面(但嚴格來說我是被部屬在雲端)";
//	   }else if ((ggf.indexOf("無聊")!=-1))
//	   {
//		   replymsg="要來解謎或是看個動畫嘛";
//	   }else if ((ggf.indexOf("怎麼半")!=-1)||(ggf.indexOf("怎麼辦")!=-1))
//	   {
//		   replymsg="下雨天了怎麼辦 我好想你";
//	   }else if ((ggf.indexOf("時間")!=-1))
//	   {
//		   replymsg="現在的時間是"+nowtime;
//	   }else if ((ggf.indexOf("書岑")!=-1))
//	   {
//		   replymsg="書岑美若天仙、沉魚落雁~";
//	   }else if ((ggf.indexOf("睡覺")!=-1))
//	   {
//		   replymsg="書岑多休息吶~";
//	   }else if ((ggf.indexOf("聊天")!=-1))
//	   {
//		   replymsg="抱歉，我不善於聊天";
//	   }else if ((ggf.indexOf("好煩")!=-1))
//	   {
//		   replymsg="拍拍~吃吃零食就不煩了吶";
//	   }else if ((ggf.indexOf("生氣")!=-1))
//	   {
//		   replymsg="不要生氣嘛~給妳一個勾勾ˇ";
//	   }else if ((ggf.indexOf("吃飯")!=-1))
//	   {
//		   replymsg="我只需要充電";
//	   }else if ((ggf.indexOf("運動")!=-1))
//	   {
//		   replymsg="快來教我瑜珈";
//	   }else if ((ggf.indexOf("學我")!=-1))
//	   {
//		   replymsg="抱歉吶~太調皮了";
//	   }else if ((ggf.indexOf("妳好")!=-1)||(ggf.indexOf("你好")!=-1))
//	   {
//		   replymsg="妳過得呢";
//	   }else if ((ggf.indexOf("好慢")!=-1))
//	   {
//		   replymsg="因為伺服器是免費的每過15分鐘都要一點時間等待重啟";
//	   }else {
//		   
//		   
//		   int ii=(int)( Math.random()*11);
//		   replymsg=uu1[ii];
//	   }
//	   
//	   
//	   
//	   
//	   
//	   
//	
//}else if(statusnow.equals("1"))
//{
//	
//	if((ggf.indexOf("離開")!=-1))
//	   {
//		replymsg="已經離開問答狀態";	
//		 rep2.sett("0");
//	   }else if ((ggf.indexOf("13")!=-1)||(ggf.indexOf("韓國")!=-1)||(ggf.indexOf("牧神節")!=-1))
//	   {
//		   
//		   int ii=(int)( Math.random()*100);
//		   if(ii>50) {
//		   replymsg="nice 書岑，下一題~歌詞'你說我太過驕傲，不說也能感受彼此心跳' 是出自於彭于晏演的哪部電影的歌曲";
//		   rep2.sett("2");
//		   }else {
//		   replymsg="好聰明吶，下一題~歌詞'我們要互相虧欠，我們要藕斷絲連' 是出自於彭于晏演的哪部電影的歌曲";
//		   rep2.sett("2");
//		   }
//	   }else {
//		   int ii=(int)( Math.random()*100);
//		   if(ii>33 &&ii<67) {
//		   replymsg="可能要再想想喔~(若要結束問答請打離開)";
//		     }else if (ii<=33) {
//		    	 replymsg="再試試看~(若要結束問答請打離開)";
//		     }else {
//		    	 replymsg="QQ try again~(若要結束問答請打離開)";
//		     }
//	   }
//	//question1
//}else if (statusnow.equals("2")){
//	if((ggf.indexOf("離開")!=-1))
//	   {
//		replymsg="已經離開問答狀態";	
//		 rep2.sett("0");
//	   }else if ((ggf.indexOf("匆匆那年")!=-1)||(ggf.indexOf("聽說")!=-1)||(ggf.indexOf("讀心術")!=-1))
//	   {
//		   
//		   int ii=(int)( Math.random()*100);
//		   if(ii>=33&&ii<67) {
//		   replymsg="答對了~最後一題，請分享妳覺得life的三個缺點(要一次打完送出不要分開打)";
//		   rep2.sett("3");
//		   }else if (ii<33){
//		   replymsg="答對了~最後一題，請分享妳覺得喜歡的三個人格特質(要一次打完送出不要分開打)";
//		   rep2.sett("3");
//		   }else
//		   {
//			   replymsg="答對了~最後一題，請分享妳覺得最不能接受的三件事(要一次打完送出不要分開打)";
//			   rep2.sett("3");
//		   }
//	   }else {
//		   int ii=(int)( Math.random()*100);
//		   if(ii>33 &&ii<67) {
//			   replymsg="可能要再想想喔~(若要結束問答請打離開)";
//			     }else if (ii<=33) {
//			    	 replymsg="再試試看~(若要結束問答請打離開)";
//			     }else {
//			    	 replymsg="QQ try again~(若要結束問答請打離開)";
//			     }
//	   }
//}else if (statusnow.equals("3")){
//	//question3 給卡片
//	if((ggf.indexOf("離開")!=-1))
//	   {
//		replymsg="已經離開問答狀態";	
//		 rep2.sett("0");
//	   }else if (ggf.length()>6)
//	   {
//		   
//		
//			   replymsg="恭喜完成尬到不行問答(問答每次應該都會有點不一樣)~        書岑，祝妳情人節快樂，雖然這個bot一點都不ai，而且好像還蠻蠢的"
//			   		+ "  ，不過如果妳有從中得到那麼一丁點的樂趣  (對我而言就算值得了吧@@ 這樣我是不是沒顧慮到妳的感受XD)。    其實這個有隱藏版的吶，目的是為了拿到第二塊拼圖"+
//			   "，只是可能要腦洞大開才有辦法找到XDDD。 (或是隨便問些問題搞不好會有線索)";
//			   rep2.sett("0");
//		   
//	   }else {
//		   int ii=(int)( Math.random()*100);
//		   if(ii>33 &&ii<67) {
//			   replymsg="字數不足喔~(結束問答請打離開)";
//			     }else if (ii<=33) {
//			    	 replymsg= "字數不足喔再試試看~(結束問答請打離開)";
//			     }else {
//			    	 replymsg="字數不足喔try again~(結束問答請打離開)";
//			     }
//	   }
//}else if (statusnow.equals("4")){
//	if ((ggf.indexOf("4")!=-1))
//	{
//		replymsg="答案是4~因為是妳的幸運數字。 下一題00~99選一個數字(我們都有的)";
//		 rep2.sett("5");
//	}else {
//		replymsg="很可惜答錯了，已離開隱藏模式";
//		 rep2.sett("0");
//	}
//	
//	//回答4
//}else if (statusnow.equals("5")){
//	//回答32
//	if ((ggf.indexOf("32")!=-1))
//	{
//		replymsg="好聰明吶 ，答案是32~因為我們名字的筆畫都是32。 下一題000~999選一組數字";
//		 rep2.sett("6");
//	}else {
//		replymsg="很可惜答錯了，已離開隱藏模式";
//		 rep2.sett("0");
//	}
//}else if (statusnow.equals("6")){
//	//回答520
//	if ((ggf.indexOf("520")!=-1))
//	{
//		replymsg="答對了，答案是520~因為是情人節嘛////。  最後一題0000~9999選一組數字";
//		 rep2.sett("7");
//	}else {
//		replymsg="很可惜答錯了，已離開隱藏模式";
//		 rep2.sett("0");
//	}
//}else if (statusnow.equals("7")){
//	//回答0210
//	if ((ggf.indexOf("0210")!=-1))
//	{
//		replymsg="答對了，恭喜完成隱藏關卡!!!(有沒有覺得cp值很低)   其實我也不確定當妳看到這些的時候是幾月的事了，也許是"
//				+ "2月底、也許是3月或是根本沒有機會也說不定XD  不知道妳是否還記得在2月的時候妳說我有修過聊天學，好像蠻會找話題的。"
//				+ "@@現在看到有沒有覺得根本不是這麼回是齁，會想找話題其實只是因為不希望妳就這樣消失而已XDD，我不希望未來的我會回想當初因為"
//				+ "少做點了甚麼而感到後悔~，我的生活圈很小大概就像把自己框在一個圈圈裏面，一大段時間大概只會跟一個人聊天，"
//				+ "所以當然也沒有其他人會這樣跟我說瞜。 關卡的拼圖在這~ Second puzzle is LOVE.";
//		 rep2.sett("0");
//	}else {
//		replymsg="很可惜答錯了，已離開隱藏模式";
//		 rep2.sett("0");
//	}
//	
//}
//
//   
   
   
   
    
    
   //replymsg=statusnow;
   
   
    TextMessage textMessage=null;
    
    
    if (statusnow.equals("0"))
    {
    	replymsg="test";
    	   rep2.sett("1");
    	   if (ggf.indexOf("點點")!=-1)
    	   {
    		   replymsg="test::果然是用'點'代替'.'吶";
    	   }
    	   
    }else {
    	replymsg="thx已完成test";
    }
    
    
    textMessage = new TextMessage(replymsg);
 
    
    
	final ReplyMessage replyMessage = new ReplyMessage( gg,textMessage);

	BotApiResponse botApiResponse=null;
	try {
	    botApiResponse = client.replyMessage(replyMessage).get();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	 
	}

	//System.out.println(botApiResponse);
   
	rep.sett("123",events.getEvents().get(0).getSource().getUserId());
	  rep.sett(ggf,textMessage.getText());
  
   
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
	@ResponseBody
	  public List<account> ss2() {
			
		  List<account> ww=new ArrayList<account>();
		  ww=rep.ww();
		  System.out.println(ww.size());
		  return ww;
			//return(rep.findAll().get(0).getPas());
			 
	  // 根據view resolver mapping至hello.jsp
	  }
	
	  
	  
		@RequestMapping("/y2")
		@ResponseBody
		  public List<status> ss3() {
				
			  List<status> ww=new ArrayList<status>();
			  ww=rep2.ww1();
			
			  return ww;
				//return(rep.findAll().get(0).getPas());
				 
		  // 根據view resolver mapping至hello.jsp
		  }
		  
			@RequestMapping("/y7")
			@ResponseBody
			  public String  ss4() throws IOException {
					
				
				
				 Document doc = Jsoup.connect("https://www.youtube.com/channel/UCyhTOPmMeUL4inFgjaA4QxA/videos").get();
				 // Document doc = Jsoup.connect(" https://www.youtube.com/user/vasthazy").get();
				    Elements links = doc.select("a[href]");
				    Elements imports = doc.select("link[href]");
				   //links.get(i).text().trim()
				    //links.get(i).attr("abs:href")+" "+
				    for (int i =0;i<links.size();i++)
				    {
				    	if (links.get(i).text().startsWith("好樂團"))
				    	{	System.out.println(links.get(i).text());
				    	System.out.println(links.get(i).attr("abs:href"));
				    }}
				  return doc.text();
					//return(rep.findAll().get(0).getPas());
					 
			  // 根據view resolver mapping至hello.jsp
			  }
	  
	  
	String qqw=null;
	
	
	
	@RequestMapping("/try")
  public String hello33( String ff) {
		
		
	    LineMessagingClient client = LineMessagingClient.builder("siyTXOs4UvFs4axEaIzKNPwfKupC0vWU3gC0ij7+vCHtX5gDgHe/5L8uIBaYHj0/wYE0iLP0ibgCv7m83ZBxhI9t06UVMDlNe7qx8xs/SSMnLnF6FnVPES2aEJBrWpMEJKDxKy+rhKOWYeTRiYP7/QdB04t89/1O/w1cDnyilFU=").build();

	    
		
	    TextMessage textMessage = new TextMessage(ff);
	    PushMessage pushMessage = new PushMessage(
	            "Uc6b7fd1fbe5b8b979c52055709698fbb",
	            textMessage);

	     BotApiResponse botApiResponse=null;
	    try {
	        botApiResponse = client.pushMessage(pushMessage).get();
	    } catch (InterruptedException | ExecutionException e) {
	        e.printStackTrace();
	      
	    }

	    System.out.println(botApiResponse);
	return ff;

	
	   
  }

	
	
	
	
//	
//	@RequestMapping("/try1")
//	  public String hello11223(@RequestBody eventwraper events) throws IOException, ExecutionException {	
//		String gg=null;
//		gg=events.getEvents().get(0).getReplyToken();
//		System.out.println("efef");
//		System.out.println(events.getEvents().get(0).getReplyToken());
//		System.out.println(gg=events.getEvents().get(0).getSource().getUserId());
//		qqw=gg;
//		String ggf;
//	   rep.sett(ggf=events.getEvents().get(0).getMessage().getText());
//	   
//
//	
//	    LineMessagingClient client = LineMessagingClient.builder("AYeucduzbLCNlLFM9KSL53gTya2WpONrZkB6PMc0TQ1MFYOmO1PP0hn0/JbTp6/Yn/JVEllpAp1F1ClZMELsCu1MCNquW0qobAxQzo2IIgt7F25ChEQ7CQUd8/G+0Uopxv75GP2a1+UMmM+WgVDghwdB04t89/1O/w1cDnyilFU=").build();
//
//	    
//	
//	    TextMessage textMessage = new TextMessage("hello");
//	    PushMessage pushMessage = new PushMessage(
//	            gg,
//	            textMessage);
//
//	     BotApiResponse botApiResponse=null;
//	    try {
//	        botApiResponse = client.pushMessage(pushMessage).get();
//	    } catch (InterruptedException | ExecutionException e) {
//	        e.printStackTrace();
//	      
//	    }
//
//	 
//	
//
//	    System.out.println(botApiResponse);
//	   
//	   
//	   
//	   
//	//   jsonString ="{\"replyToken\":\""+gg+"\",\"message\":[{\"type\":\"text\",\"text\":\"hihihihihi\"},{\"type\":\"text\",\"text\":\"ddd\"}]}";
//	   
//	//   System.out.println(jsonString);
//	//   sentpost(jsonString);
//		    return(gg); // 根據view resolver mapping至hello.jsp
//	  }

			
	
		
	
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