package com.comtrade.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.comtrade.demo.dao.LanguageRepo;
import com.comtrade.demo.entity.Language;

@Controller
public class LanguageController {
	
	@Autowired
	LanguageRepo repo;
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	
	@RequestMapping("/addLanguage")
	public String addLanguage(Language language) {
		repo.save(language);
		return "index.html";
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam String name) {
		ModelAndView mv = new ModelAndView("hello.html");
		Language language = repo.findByName(name);
		mv.addObject(language);
		return mv;
	}
	@GetMapping("/secure")
	public String showLoginPage() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication==null || authentication instanceof AnonymousAuthenticationToken) {
			return "secure.html";
		}
		return "redirect:/";
	}
}
