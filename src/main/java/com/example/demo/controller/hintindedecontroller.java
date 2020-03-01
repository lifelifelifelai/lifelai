package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.repository;
import com.example.demo.repository.repositoryplaystatus;
import com.example.demo.entity.playstatus;
@Controller
@RequestMapping("/ggg")
public class hintindedecontroller {

	
	
	@Autowired 
	repositoryplaystatus rep4;
	@Autowired 
	repository rep;
	
	@Autowired 
	playstatus playstatus;
	
	
	@RequestMapping("/inind0")
		
	public String testing00(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{ }

		
		return "inind0";
	}
	@RequestMapping("/inind1")
	public String testing11(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind1";
	}
	
	@RequestMapping("/inind2")
	public String testing332(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind2";
	}
	@RequestMapping("/inind3")
	public String testing33(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind3";
	}
	
	@RequestMapping("/inind4")
	public String testing44(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind4";
	}
	@RequestMapping("/inind5")
	public String testing55(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind5";
	}
	@RequestMapping("/inind6")
	public String testing66(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind6";
	}
	
	@RequestMapping("/inind7")
	public String testing777(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind7";
	}
	
	@RequestMapping("/inind8")
	public String testing77(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind8";
	}
	
	@RequestMapping("/inind9")
	public String testing88(Model model) {
		
		playstatus=rep4.getstatus();
		
		model.addAttribute("nowrate", playstatus.getStatus2().length()+"/5");
		if (playstatus.getStatus1().equals("0"))
		{model.addAttribute("errormsg", "Shutsen目前答錯"+playstatus.getStatus1()+"次");}
		else 
		{model.addAttribute("errormsg",""); }

		return "inind9";
	}
	
	
	@RequestMapping("/hint0")
	public String testing0110(Model model) {
		


		return "hint0";
	}
	@RequestMapping("/hint1")
	public String testing101210(Model model) {
		


		return "hint1";
	}
	@RequestMapping("/hint2")
	public String testing01210(Model model) {
		


		return "hint2";
	}
	@RequestMapping("/hint3")
	public String testing30110(Model model) {
		


		return "hint3";
	}
	@RequestMapping("/hint4")
	public String testing04110(Model model) {
		


		return "hint4";
	}
	@RequestMapping("/hint5")
	public String testing50110(Model model) {
		


		return "hint5";
	}
	@RequestMapping("/hint6")
	public String testing06110(Model model) {
		


		return "hint6";
	}
	@RequestMapping("/hint7")
	public String testin7g0110(Model model) {
		


		return "hint7";
	}
	@RequestMapping("/hint8")
	public String testin8g0110(Model model) {
		


		return "hint8";
	}
	@RequestMapping("/hint9")
	public String testing090(Model model) {
		


		return "hint9";
	}
	@RequestMapping("/gamecheck0")
	//回到start orstart2
	public String testi1ewe3(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck0",songname);
		if (songname.indexOf("我愛你")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"0";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			
					
					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind0";
			}
		
		}

	}
	@RequestMapping("/gamecheck1")
	//回到start orstart2
	public String testi113(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
		
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck1",songname);
		if (songname.indexOf("愛灌溉")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"1";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind1";
			}
		
		}

	}
	@RequestMapping("/gamecheck2")
	//回到start orstart2
	public String testing223(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck2",songname);
		if (songname.indexOf("一樣可惜")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"2";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind2";
			}
		
		}

	}
	@RequestMapping("/gamecheck3")
	//回到start orstart2
	public String testing23(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck3",songname);
		if (songname.indexOf("想見你")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"3";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind3";
			}
		
		}

	}
	@RequestMapping("/gamecheck4")
	//回到start orstart2
	public String tes4(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck4",songname);
		if (songname.indexOf("的約定")!=-1||songname.indexOf("蒲公英")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"4";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind4";
			}
		
		}

	}
	@RequestMapping("/gamecheck5")
	//回到start orstart2
	public String testing5(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck5",songname);
		if (songname.indexOf("愛在夏天")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"5";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind5";
			}
		
		}

	}
	@RequestMapping("/gamecheck6")
	//回到start orstart2
	public String testing26(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck6",songname);
		if (songname.indexOf("幾分之幾")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"6";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind6";
			}
		
		}

	}
	@RequestMapping("/gamecheck7")
	//回到start orstart2
	public String testing73(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck7",songname);
		if (songname.indexOf("秘密")!=-1||songname.indexOf("ecret")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"7";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind7";
			}
		
		}

	}
	@RequestMapping("/gamecheck8")
	//回到start orstart2
	public String testi8we3(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck8",songname);
		if (songname.indexOf("life")!=-1||songname.indexOf("你")!=-1||songname.indexOf("勁甫")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"8";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
								
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind8";
			}
		
		}

	}
	@RequestMapping("/gamecheck9")
	//回到start orstart2
	public String te9ng2wewe3(HttpServletRequest request,Model model) {
		playstatus =rep4.getstatus();
	String songname=request.getParameter("歌曲名");
	rep.sett("gcheck9",songname);
		if (songname.indexOf("我愛你")!=-1)
		{
			if(playstatus.getStatus2().length()>=4)
			{
				rep4.updatesall("0","","1");
				return "succes";
			}else
			{
				rep4.updates1("0");
				String qq =playstatus.getStatus2()+"9";
				rep4.updates2(qq);
				String qqa="inind";
				String ww="";
				for (int ii=1;ii<2;ii++)
				{			

					int qqw=(int)(Math.random()*17);
					if(qqw==9||qqw==10)
					{
						qqw=3;
					}else if(qqw==11||qqw==12)
					{
						qqw=4;
					}else if (qqw==13||qqw==14)
					{
						qqw=7;
					}else if (qqw==15||qqw==16)
					{
						qqw=6;
					}else {}
				 ww=qqw+"";
				if(qq.indexOf(ww)!=-1)
				{
					ii=ii-1;
				}else 
				{
					
					model.addAttribute("nowrate", (playstatus.getStatus2().length()+1)+"/5");
					model.addAttribute("errormsg", "Correct!! question"+(playstatus.getStatus2().length()+2));
					return "inind"+ww;
				
				}
				
				}
				return qqa+ww;
			}
	
		}else 
		{
			if(playstatus.getStatus1().equals("2")||playstatus.getStatus1().equals("3"))
			{
			
			return "fail"; 
			}else 
			{
				String count=(Integer.parseInt(playstatus.getStatus1())+1)+"";
				String count2=playstatus.getStatus2().length()+"";
				rep4.updates1(count);
				model.addAttribute("nowrate", count2+"/5");
				model.addAttribute("errormsg", "Shutsen目前答錯"+count+"次");
				
				return "inind9";
			}
		
		}

	}
	
	
}
