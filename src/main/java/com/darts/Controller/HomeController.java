package com.darts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darts.service.NewsService;

@Controller
public class HomeController {
	public NewsService newsService;
	
	@Autowired
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	@RequestMapping("/news")
	public String news( Model model) {
		model.addAttribute("news", newsService.getNews());
		return "news";
	}
	
	@RequestMapping("/")
	public String index( Model model) {
		return "index";
	}
	
	@RequestMapping("/tipps")
	public String tipps( Model model) {
		return "tipps";
	}
	
}
