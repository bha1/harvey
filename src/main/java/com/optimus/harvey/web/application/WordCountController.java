package com.optimus.harvey.web.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.optimus.harvey.business.domain.WordCount;
import com.optimus.harvey.business.service.WordCountService;

@Controller
@RequestMapping("/wordcount")
public class WordCountController {
	
	@Autowired
	WordCountService wordCountService;

	@RequestMapping(method = RequestMethod.GET)
	public String getCount(Model model){
		WordCount wordCount = new WordCount();
		wordCount.setSourceString("");
		model.addAttribute("wordCount",wordCount);
		return "wordcount";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String getCount(WordCount wordCount,Model model){
		wordCount.setWordMap(this.wordCountService.countWords(wordCount.getSourceString()));
		model.addAttribute("wordCount",wordCount);
		return "wordcount";
	}
}
