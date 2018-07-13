package com.school.attendance.domine.standard;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="standard1")
public class Standard implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6569459740046723403L;
    @Id
    @Column(name="stdid")
	private String stdid;
    
    public String getStdid() {
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
	}
	@Column(name="standard")
	private String standard;
    @Column(name="medium")
	private String medium;
    @Column(name="section")
	private String section;
    @Column(name="syllabus")
	private String syllabus;
    @Column(name="subject1")
	private String subject1;
    @Column(name="subject2")
	private String subject2;
    @Column(name="subject3")
	private String subject3;
    @Column(name="subject4")
	private String subject4;
    @Column(name="subject5")
	private String subject5;
    @Column(name="subject6")
	private String subject6;
    @Column(name="subject7")
	private String subject7;
    @Column(name="subject8")
	private String subject8;
    @Column(name="isActive")
	private boolean isActive;
	
	

	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getSyllabus() {
		return syllabus;
	}
	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public String getSubject3() {
		return subject3;
	}
	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}
	public String getSubject4() {
		return subject4;
	}
	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}
	public String getSubject5() {
		return subject5;
	}
	public void setSubject5(String subject5) {
		this.subject5 = subject5;
	}
	public String getSubject6() {
		return subject6;
	}
	public void setSubject6(String subject6) {
		this.subject6 = subject6;
	}
	public String getSubject7() {
		return subject7;
	}
	public void setSubject7(String subject7) {
		this.subject7 = subject7;
	}
	public String getSubject8() {
		return subject8;
	}
	public void setSubject8(String subject8) {
		this.subject8 = subject8;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
    
    
}
