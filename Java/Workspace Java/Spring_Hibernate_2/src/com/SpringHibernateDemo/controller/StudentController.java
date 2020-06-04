//
package com.SpringHibernateDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/index")
	public String setupForm(Model model) {
//		model.addAttribute("studentList", studentService.getAllStudent());
		return "student";
	}
}
