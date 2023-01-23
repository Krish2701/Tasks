package org.company;

public class CompanyInfo {
	void companyName(String cname) {
		System.out.println("the name of the company is :" + cname);
	}
	void companyName(int cid ,String cname) {
		System.out.println("the id of the company is :" + cid);
		System.out.println("the name of the company is :" + cname);
	}
	public static void main(String[] args) {
		CompanyInfo cin = new CompanyInfo();
		cin.companyName("Tekizma");
		cin.companyName(101,"Tekiz");
	}
}
