package com.harman.tracker.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harman.tracker.model.PoiDetail;

public interface PoiRepository extends JpaRepository<PoiDetail, Long>{

}
