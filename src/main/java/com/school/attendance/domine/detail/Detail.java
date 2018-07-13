package com.school.attendance.domine.detail;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Detail1")
public class Detail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -39082786967525314L;

	
	@Column(name="StudentName")
	private String StudentName;
	@Column(name="StudentId")
	private String StudentId;
	@Id
	@Column(name="DetailID")
	private String DetailID;
	@Column(name="Exam_Type")
	private String Exam_Type;
	@Column(name="marks_subject1")
	private Integer marks_subject1;
	@Column(name="marks_subject2")
	private Integer marks_subject2;
	@Column(name="marks_subject3")
	private Integer marks_subject3;
	@Column(name="marks_subject4")
	private Integer marks_subject4;
	@Column(name="marks_subject5")
	private Integer marks_subject5;
	@Column(name="marks_subject6")
	private Integer marks_subject6;
	@Column(name="marks_subject7")
	private Integer marks_subject7;
	@Column(name="marks_subject8")
	private Integer marks_subject8;
	@Column(name="mobilenumber")
	private String mobilenumber;
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Column(name="Year")
	private Integer Year;
	@Column(name="total_marks")
	private Integer total_marks;
	@Column(name="presentpercent")
	private float presentpercent;
	@Column(name="no_days")
	private Integer no_days;
	@Column(name="present_days")
	private Integer present_days;
	@Column(name="isActive")
	private boolean isActive;
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getDetailID() {
		return DetailID;
	}
	public void setDetailID(String detailID) {
		DetailID = detailID;
	}
	public String getExam_Type() {
		return Exam_Type;
	}
	public void setExam_Type(String exam_Type) {
		Exam_Type = exam_Type;
	}
	public Integer getMarks_subject1() {
		return marks_subject1;
	}
	public void setMarks_subject1(Integer marks_subject1) {
		this.marks_subject1 = marks_subject1;
	}
	public Integer getMarks_subject2() {
		return marks_subject2;
	}
	public void setMarks_subject2(Integer marks_subject2) {
		this.marks_subject2 = marks_subject2;
	}
	public Integer getMarks_subject3() {
		return marks_subject3;
	}
	public void setMarks_subject3(Integer marks_subject3) {
		this.marks_subject3 = marks_subject3;
	}
	public Integer getMarks_subject4() {
		return marks_subject4;
	}
	public void setMarks_subject4(Integer marks_subject4) {
		this.marks_subject4 = marks_subject4;
	}
	public Integer getMarks_subject5() {
		return marks_subject5;
	}
	public void setMarks_subject5(Integer marks_subject5) {
		this.marks_subject5 = marks_subject5;
	}
	public Integer getMarks_subject6() {
		return marks_subject6;
	}
	public void setMarks_subject6(Integer marks_subject6) {
		this.marks_subject6 = marks_subject6;
	}
	public Integer getMarks_subject7() {
		return marks_subject7;
	}
	public void setMarks_subject7(Integer marks_subject7) {
		this.marks_subject7 = marks_subject7;
	}
	public Integer getMarks_subject8() {
		return marks_subject8;
	}
	public void setMarks_subject8(Integer marks_subject8) {
		this.marks_subject8 = marks_subject8;
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer year) {
		Year = year;
	}
	public Integer getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(Integer total_marks) {
		this.total_marks = total_marks;
	}
	public float getPresentpercent() {
		return presentpercent;
	}
	public void setPresentpercent(float presentpercent) {
		this.presentpercent = presentpercent;
	}
	public Integer getNo_days() {
		return no_days;
	}
	public void setNo_days(Integer no_days) {
		this.no_days = no_days;
	}
	public Integer getPresent_days() {
		return present_days;
	}
	public void setPresent_days(Integer present_days) {
		this.present_days = present_days;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}