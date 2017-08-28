package com.optimus.harvey.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/information")
public class InfoController {

	@RequestMapping(method = RequestMethod.GET)
	public String getInfo(@RequestParam(value="number", required=false)String numb,Model model){
		model.addAttribute("information1","some text");
		return "information";
	}
}
