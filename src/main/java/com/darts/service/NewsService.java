package com.darts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darts.domain.News;
import com.darts.repository.NewsRepository;
@Service
public class NewsService {
	private NewsRepository newsRepo;

	@Autowired
	public void setNewsRepo(NewsRepository newsRepo) {
		this.newsRepo = newsRepo;
	}

	public List<News> getNews() {
		return newsRepo.findAll();
	}

	
}
