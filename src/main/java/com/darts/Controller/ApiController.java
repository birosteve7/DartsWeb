package com.darts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darts.domain.News;
import com.darts.service.NewsService;


/*@RestController
public class ApiController {
	
	NewsService newsService;
	
	@Autowired
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	@RequestMapping("/news/{link}")
	public News searchForUser(@PathVariable(value="link") String link) {
		return newsService.getNewsContent(link);
	}
	
}*/
