package com.medico.medicine;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class home {
	@RequestMapping("/home")
	  public String home() {
	      return "home.html";
	  }
	
}
