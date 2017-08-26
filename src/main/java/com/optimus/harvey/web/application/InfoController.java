package com.optimus.harvey.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/info")
public class InfoController {

	@RequestMapping(method = RequestMethod.GET)
	public String getInfo(Model model){
		model.addAttribute("info","information");
		return "info";
	}
}
