package com.ps.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MasterController {
	
	@RequestMapping(value="/")
	@ResponseBody
	public String home() {
		return "return string";
	}
}
