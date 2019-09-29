package com.harman.tracker.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poiDetail")
public class PoiDetail {

	@Id
	@Column(name = "harman_id", nullable = false)
	private long harmanId;
	
	@Column(name = "poi_number", nullable = false)
	private String poiNumber;
	
	@Column(name = "poi_startdate", nullable = false)
	private Date poiStartDate;
	
	@Column(name = "poi_enddate", nullable = false)
	private Date poiEndDate;
	
	@Column(name = "poivalue", nullable = false)
	private String poiValue;
	
	
	public long getHarmanId() {
		return harmanId;
	}
	public void setHarmanId(long harmanId) {
		this.harmanId = harmanId;
	}
	public String getPoiNumber() {
		return poiNumber;
	}
	public void setPoiNumber(String poiNumber) {
		this.poiNumber = poiNumber;
	}
	public Date getPoiStartDate() {
		return poiStartDate;
	}
	public void setPoiStartDate(Date poiStartDate) {
		this.poiStartDate = poiStartDate;
	}
	public Date getPoiEndDate() {
		return poiEndDate;
	}
	public void setPoiEndDate(Date poiEndDate) {
		this.poiEndDate = poiEndDate;
	}
	public String getPoiValue() {
		return poiValue;
	}
	public void setPoiValue(String poiValue) {
		this.poiValue = poiValue;
	}
	
	
	
}
