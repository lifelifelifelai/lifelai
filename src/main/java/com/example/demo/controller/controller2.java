package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.repositorystatus;

@RestController
@Controller
@RequestMapping("/ggg")
public class controller2 {

	
	
	@Autowired
	repositorystatus rep2;
	
    @GetMapping("/y25/{num}")  // {num} 代表 URL 變數
    public String tt4(@PathVariable int num) {
        System.out.println("收到的數字：" + num);
       if ( num> Integer.valueOf(rep2.status())) 
        rep2.sett(String.valueOf(num));
        
        return "{}";
    }
}
