package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class appservice {

	
	
	
	public String login (String account, String password)
	{
	 
		
		
		if ((account.equals("LUNLUN")||account.equals("life"))&&password.equals("1121"))
		{
			return "yes";
		}
		else if ((account.equals("LUNLUN")||account.equals("life"))&&(!password.equals("1121"))) 
{
		return "wrorng password"; 

}
else if (!account.equals("LUNLUN"))
{
	return "wrong account";
}else 
{
	
	return "idk";
}

}
	
}
