package com.long2m9_Assignment0.long2m9_Assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Assignment0Controller {

@RequestMapping("/index")
public String start() {
	return "start";
}
	
}
