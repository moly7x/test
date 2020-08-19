//
package com.moly7x.springmvcboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moly7x.springmvcboot.model.Ailen;

/**
 * This class is .
 * 
 * @author: Tân
 * @create_date: 29/07/2020
 */

@Controller
public class HomeController {
	
	@Autowired
	AilenRepo repo;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Ailens");
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("getAilen")
	public String getAilen(@RequestParam int aid, Model m) {
		
		m.addAttribute("result", repo.getOne(aid));
		
		return "showAilens";
	}
	
	@GetMapping("getAilenByName")
	public String getAilenByName(@RequestParam String aname, Model m) {
		
		m.addAttribute("result", repo.find(aname));
		
		return "showAilens";
	}

	@PostMapping(value = "addAilen")
	public String addAilen(@ModelAttribute Ailen a) {
		repo.save(a);
		return "result";
	}
	
	@GetMapping("getAilens")
	public String getAilens(Model m) {
		
		m.addAttribute("result", repo.findAll());
		
		return "showAilens";
	}
}
