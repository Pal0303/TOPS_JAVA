/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.*/

package com.Assignment;

public class Q24_member {
	public static class member{
		int age, mobile, salary;
		String name, address;
		member(int age, int mobile, int salary, String name, String address){
			this.age=age;
			this.mobile=mobile;
			this.salary=salary;
			this.name=name;
			this.address=address;
		}
		public void printSalary() {
			System.out.println("Name: "+name+"  Age: "+age+"  Phone number: "+mobile+"  Address: "+address+"  Salary: "+salary);
		}
	}
	
	public static void main(String[] args) {
		member m=new member(21,12345,50000,"Pal","Gota");
		m.printSalary();
	}
}
