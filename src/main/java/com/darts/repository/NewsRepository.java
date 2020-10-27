package com.darts.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darts.domain.News;
@Repository
public interface NewsRepository extends CrudRepository<News, Long>{
 
	List<News> findAll();
}
