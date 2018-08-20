package com.lxc.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



//使用@Controller标识它是一个控制器
@Controller
//为什么不需要实现controller接口？？？？？？
public class homeController {
//	一般建议将url和方法名称写成一致，方便维护
	
//	@RequestMapping实现对home方法和url进行映射，一个方法对应一个url
	 @RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public String home(ModelMap model ) {
		 model.addAttribute("data","ninhao");
		return "welcome";
		
	}
}
