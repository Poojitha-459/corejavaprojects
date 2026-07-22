package com.projects1;

import java.util.Scanner;

import com.projects1.PersonalLoanApplication;

public class PersonalLoanApplication {
	Scanner Sc = new Scanner(System.in);

	String getcustomerAddressdetails() {
		String address = null;
		System.out.println("enter your flat num");
		String fno = Sc.nextLine();
		System.out.println("enter your plot num");
		Sc.nextLine();
		String pno = Sc.nextLine();
		System.out.println("enter your street name");
		String street = Sc.nextLine();
		System.out.println("enter your city name");
		String city = Sc.nextLine();
		System.out.println("enter your pincode");
		Long pin = Sc.nextLong();
		address = "flatno:" + fno + "plotno:" + pno + "streetname:" + street + "cityname:" + city + "pincode:" + pin;
		return address;
	}

	public boolean isValidPAN() {
		System.out.println("enter pan num:");
		String PAN = Sc.next();
		return PAN.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	public boolean isValidPhone() {
		System.out.println("enter your phone num:");
		String Phone = Sc.next();
		return Phone.matches("[6-9]\\d{12}");
	}

	public boolean isValidAadhaar() {
		System.out.println("enter 12 digit aadhar num:");
		String Aaadhar = Sc.next();
		return Aaadhar.matches("\\d{12}");
	}

	double getROI() {
		return 10.5;
	}

	int getcibiliscore() {
		System.out.println("enter your cibilscore");
		int cibil = Sc.nextInt();
		return cibil;
	}

	int getcustomerage() {
		System.out.println("enter your age");
		int age = Sc.nextInt();
		return age;
	}

	double getcustomersalary() {
		System.out.println("enter your salary");
		double salary = Sc.nextDouble();
		return salary;
	}

	void getpersonalloanDocInformation() {
		System.out.println("successfully all the documents are submitted");
	}

	public static void main(String[] args) {
		System.out.println("welcome to bank loan");
		PersonalLoanApplication p1 = new PersonalLoanApplication();
		int cibil = p1.getcibiliscore();
		int age = p1.getcustomerage();
		double salary = p1.getcustomersalary();
		if (cibil > 760 && salary > 1000000.00 && age > 25 && p1.isValidAadhaar() && p1.isValidPAN()&& p1.isValidPhone()) {
			System.out.println("congrats!!your loan got approved");
			System.out.println("your personalloan ROI is:" + p1.getROI());
			System.out.println("as entered conforming your details are:");
			System.out.println(p1.getcustomerAddressdetails());
			p1.getcustomerAddressdetails();
		} else {
			System.out.println("sooo sry!!!your loan got rejected");
		}
	}
	}


