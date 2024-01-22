package com.mall.template.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mall.template.service.MainService;
import com.mall.template.vo.MainVo;

@RestController
@RequestMapping("/")
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping
	public List<MainVo> main() {
		return mainService.getUser();
	}
}