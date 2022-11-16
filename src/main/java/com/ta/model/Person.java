package com.ta.model;

public class Person {
	private String name;
	private String age;
	private String gender;
	private String mobileNo;
	private String email;
	private String fatherName;
	private String motherName;
	private String homeLocation;
	private String jobType;
	private String salary;
	private String workLocation;
	private String education;

	public Person(String name, String age, String gender, String mobileNo, String email, String fatherName,
			String motherName, String homeLocation, String jobType, String salary, String workLocation,
			String education) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.email = email;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.homeLocation = homeLocation;
		this.jobType = jobType;
		this.salary = salary;
		this.workLocation = workLocation;
		this.education = education;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public String getHomeLocation() {
		return homeLocation;
	}

	public String getJobType() {
		return jobType;
	}

	public String getSalary() {
		return salary;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public String getEducation() {
		return education;
	}
}
