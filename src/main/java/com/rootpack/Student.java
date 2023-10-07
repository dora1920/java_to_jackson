package com.rootpack;

public class Student {
	private Integer studentId;
	private String studentName;
	private Integer studentRank;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentRank() {
		return studentRank;
	}

	public void setStudentRank(Integer studentRank) {
		this.studentRank = studentRank;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRank=" + studentRank
				+ "]";
	}

}
