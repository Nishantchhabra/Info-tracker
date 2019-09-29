package com.harman.tracker.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harman.tracker.exception.ResourceNotFoundException;
import com.harman.tracker.model.EmployeeInfo;
import com.harman.tracker.model.PoiDetail;
import com.harman.tracker.respository.PoiRepository;
import com.harman.tracker.respository.TrackerRepository;
import com.harman.tracker.util.TrackerUtil;

@RestController
@RequestMapping("/api")
public class TrackerController {

	@Autowired
	private TrackerRepository trackerRepository;

	@Autowired
	private PoiDetail poiDetaill;

	@Autowired
	private PoiRepository poirepository;

	@Autowired
	private TrackerUtil trackerutil;

	@GetMapping("/info")
	public List<EmployeeInfo> getAllInfo() {
		return trackerRepository.findAll();
	}

	@GetMapping("/info/{id}")
	public ResponseEntity<EmployeeInfo> getInfoById(@PathVariable(value = "id") Long harmanId) {
		EmployeeInfo employee = trackerRepository.findById(harmanId)
				.orElseThrow(() -> new ResourceNotFoundException(harmanId));
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/info")
	public EmployeeInfo createInfo(@Valid @RequestBody EmployeeInfo employeeInfo) {
		return trackerRepository.save(employeeInfo);
	}

	@PutMapping("/info/{id}")
	public ResponseEntity<EmployeeInfo> updateinfo(@PathVariable(value = "id") Long harmanId,
			@Valid @RequestBody EmployeeInfo employeeInfo) {
		EmployeeInfo employee = trackerRepository.findById(harmanId)
				.orElseThrow(() -> new ResourceNotFoundException(harmanId));
		EmployeeInfo employeeObj = trackerutil.mappingObjects(employeeInfo, employee);
		final EmployeeInfo updatedInfo = trackerRepository.save(employeeObj);
		return ResponseEntity.ok().body(updatedInfo);
	}

	@DeleteMapping("/info/{id}")
	public Map<String, Boolean> deletInfo(@PathVariable(value = "id") Long harmanId) {
		EmployeeInfo employee = trackerRepository.findById(harmanId)
				.orElseThrow(() -> new ResourceNotFoundException(harmanId));
		trackerRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;

	}

	@GetMapping("/info/poi")
	public List<PoiDetail> getAllPoiInfo() {
		return poirepository.findAll();
	}
	
	/*
	 * @GetMapping("/info/poi/{id}") public List<PoiDetail>
	 * getPoiInfoById(@PathVariable(value = "id") Iterable<Long> harmanId) {
	 * PoiDetail detail = poirepository.findAllById(harmanId)s .orElseThrow(() ->
	 * new ResourceNotFoundException(harmanId)); return
	 * ResponseEntity.ok().body(detail); }
	 */ 
	
}
