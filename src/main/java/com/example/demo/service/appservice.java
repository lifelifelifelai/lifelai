package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class appservice {

	
	
	
	public String login (String account, String password)
	{
	 
		
		
		if ((account.equals("MaggieMeow")||account.equals("life"))&&(password.equals("0310")||(password.equals("0710"))))
		{
			return "yes";
		}
		else if ((account.equals("MaggieMeow")||account.equals("life"))&&((!password.equals("0310"))||(!password.equals("0710")))) 
{
		return "wrorng password"; 

}
else if (!account.equals("MaggieMeow"))
{
	return "wrong account";
}else 
{
	
	return "idk";
}

}
	
}
