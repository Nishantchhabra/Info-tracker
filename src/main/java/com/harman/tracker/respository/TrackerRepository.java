package com.harman.tracker.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harman.tracker.model.EmployeeInfo;

public interface TrackerRepository extends JpaRepository<EmployeeInfo, Long>{

}
