package com.darts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darts.domain.Stats;
import com.darts.repository.StatsRepository;

@Service
public class StatsService {
	private StatsRepository statRepo;
	
	@Autowired
	public void setStatRepo(StatsRepository statRepo) {
		this.statRepo = statRepo;
	}
	
	public Stats showUserStat(long id) {
		return statRepo.findById(id);	
	}
	
}
