package com.darts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darts.domain.Stats;

@Repository
public interface StatsRepository extends CrudRepository<Stats, Long>{

	Stats findById(long id);
}
