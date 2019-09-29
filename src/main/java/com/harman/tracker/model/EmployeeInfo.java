package com.harman.tracker.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeInfo {

	@Id
	@Column(name = "harman_id", nullable = false)
	private long harmanId;
	
	@Column(name = "diamler_id", nullable = false)
	private long diamlerId;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "middle_name", nullable = true)
	private String middleName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "resigned", nullable = true)
	private boolean resigned;
	
	@Column(name = "last_working_day", nullable = true)
	private Date lwd;
	
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@Column(name = "dateofjoining_harman", nullable = false)
	private Date dojHarman;
	
	@Column(name = "billing_start_date", nullable = false)
	private Date billStartdate;
	
	@Column(name = "engagement_store", nullable = false)
	private String engagementScore;
	
	@Column(name = "criticality", nullable = true)
	private String criticality;
	
	@Column(name = "comments", nullable = true)
	private String comments;
	
	@Column(name = "internal/extenal", nullable = false)
	private String intorext;
	
	@Column(name = "skills", nullable = false)
	private String skills;
	
	@Column(name = "category", nullable = true)
	private String category;
	
	@Column(name = "core/non-core", nullable = false)
	private String coreornoncore;
	
	@Column(name = "skill", nullable = false)
	private String skill;
	
	@Column(name = "MBRDIMgr", nullable = false)
	private String mbrdiManager;
	
	@Column(name = "department", nullable = false)
	private String dept;
	
	@Column(name = "diamler_email", nullable = false)
	private String diamlerEmail;
	
	@Column(name = "harman_email", nullable = false)
	private String harmanEmail;
	
	@Column(name = "billing", nullable = false)
	private long billing;
	
	@Column(name = "experience", nullable = false)
	private long experience;
	
	@Column(name = "harman_band", nullable = false)
	private String harmanband;
	
	@Column(name = "notes", nullable = true)
	private String notes;
	
	@Column(name = "blood_group", nullable = false)
	private String bloodGroup;
	
	@Column(name = "adhaar_number", nullable = false)
	private long adhaar;
	
	@Column(name = "date_of_birth", nullable = false)
	private String dob;
	
	@Column(name = "place_of_birth", nullable = false)
	private String placeofbirth;
	
	@Column(name = "contact-number", nullable = false)
	private String contactNumber;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "emergency_contact_name", nullable = false)
	private String emergencyCName;
	
	@Column(name = "emergency_contact_number", nullable = false)
	private String emergencyCNumber;
	
	@Column(name = "passport_number", nullable = false)
	private String passportNum;
	
	@Column(name = "passport_date_of_issue", nullable = false)
	private Date passDateofissue;
	
	@Column(name = "passport_date_of_expiry", nullable = false)
	private Date passDateofexpiry;
	
	@Column(name = "educational_qualification", nullable = false)
	private String educationalQualification;
	
	@Column(name = "university", nullable = false)
	private String university;
	
	@Column(name = "year_of_passing", nullable = false)
	private String passingyear;

	public long getHarmanId() {
		return harmanId;
	}

	public void setHarmanId(long harmanId) {
		this.harmanId = harmanId;
	}

	public long getDiamlerId() {
		return diamlerId;
	}

	public void setDiamlerId(long diamlerId) {
		this.diamlerId = diamlerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isResigned() {
		return resigned;
	}

	public void setResigned(boolean resigned) {
		this.resigned = resigned;
	}

	public Date getLwd() {
		return lwd;
	}

	public void setLwd(Date lwd) {
		this.lwd = lwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDojHarman() {
		return dojHarman;
	}

	public void setDojHarman(Date dojHarman) {
		this.dojHarman = dojHarman;
	}

	public Date getBillStartdate() {
		return billStartdate;
	}

	public void setBillStartdate(Date billStartdate) {
		this.billStartdate = billStartdate;
	}

	public String getEngagementScore() {
		return engagementScore;
	}

	public void setEngagementScore(String engagementScore) {
		this.engagementScore = engagementScore;
	}

	public String getCriticality() {
		return criticality;
	}

	public void setCriticality(String criticality) {
		this.criticality = criticality;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getIntorext() {
		return intorext;
	}

	public void setIntorext(String intorext) {
		this.intorext = intorext;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCoreornoncore() {
		return coreornoncore;
	}

	public void setCoreornoncore(String coreornoncore) {
		this.coreornoncore = coreornoncore;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getMbrdiManager() {
		return mbrdiManager;
	}

	public void setMbrdiManager(String mbrdiManager) {
		this.mbrdiManager = mbrdiManager;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDiamlerEmail() {
		return diamlerEmail;
	}

	public void setDiamlerEmail(String diamlerEmail) {
		this.diamlerEmail = diamlerEmail;
	}

	public String getHarmanEmail() {
		return harmanEmail;
	}

	public void setHarmanEmail(String harmanEmail) {
		this.harmanEmail = harmanEmail;
	}

	public long getBilling() {
		return billing;
	}

	public void setBilling(long billing) {
		this.billing = billing;
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

	public String getHarmanband() {
		return harmanband;
	}

	public void setHarmanband(String harmanband) {
		this.harmanband = harmanband;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPlaceofbirth() {
		return placeofbirth;
	}

	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmergencyCName() {
		return emergencyCName;
	}

	public void setEmergencyCName(String emergencyCName) {
		this.emergencyCName = emergencyCName;
	}

	public String getEmergencyCNumber() {
		return emergencyCNumber;
	}

	public void setEmergencyCNumber(String emergencyCNumber) {
		this.emergencyCNumber = emergencyCNumber;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public Date getPassDateofissue() {
		return passDateofissue;
	}

	public void setPassDateofissue(Date passDateofissue) {
		this.passDateofissue = passDateofissue;
	}

	public Date getPassDateofexpiry() {
		return passDateofexpiry;
	}

	public void setPassDateofexpiry(Date passDateofexpiry) {
		this.passDateofexpiry = passDateofexpiry;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}
	
	
}
