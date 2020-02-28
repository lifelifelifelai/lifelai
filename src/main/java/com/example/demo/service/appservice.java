package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class appservice {

	
	
	
	public String login (String account, String password)
	{
	 
		
		
		if (account.equals("Shulife")&&password.equals("417"))
		{
			return "yes";
		}
		else if (account.equals("Shulife")&&(!password.equals("417"))) 
{
		return "wrorng password"; 

}
else if (!account.equals("Shulife"))
{
	return "wrong account";
}else 
{
	
	return "idk";
}

}
	
}
