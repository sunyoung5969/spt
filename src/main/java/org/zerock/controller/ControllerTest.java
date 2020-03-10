package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/Test/*")
@Controller
public class ControllerTest {

	@GetMapping("/test1")
	public void voidTest() {
		log.info("test1............");
	}
	
	@GetMapping("/test2")
	public String voidTest2(Model model) {
		log.info("test2..............");

		model.addAttribute("test", "들어가니 설마마마마마?!");
		
		return "Test/test1";
	}
	
}
