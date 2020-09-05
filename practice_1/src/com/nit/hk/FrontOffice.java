package com.nit.hk;

import java.util.LinkedHashSet;

import java.util.Scanner;

public class FrontOffice {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		Company cmp=new Company();
		int option;
		int count=1;
		while(true) {
			System.out.println ("Choose one Option");
			System.out.println ("1 Insert Employee&quot");
			System.out.println ("2.Select Employee ");
			System.out.println ("3.Update Employee");
			System.out.println ("4.Delete Employee");
			System.out.println ("5.Exit");
			System.out.println ("Enter option");
			option= scn.nextInt();scn.nextLine();

			switch(option){
			case 1:{//Create Employee
				System.out.println("\n Enter Employee"+count+++"details");
				Employee e= new Employee();
				System.out.println("Enter eid");
				e.setEid(scn.nextInt());scn.nextLine();
				System.out.println("Enter Ename");
				e.setEname(scn.nextLine());
				System.out.println("Enter Dept");
				e.setDept(scn.nextLine());
				System.out.println("Enter Sal");
				e.setSal(scn.nextDouble());
				System.out.println("Enter mobile");
				e.setMobile(scn.nextLong());scn.nextLine();
				System.out.println("Enter email");
				e.setEmail(scn.next());
				//storing in company
				cmp.join(e);
				System.out.println("Employee joined in company");
				try {Thread.sleep(2000);}
				catch(InterruptedException x) {}
				break;
			}

			case 2:{//select Employee
				System.out.println("Choose one option");
				System.out.println("1.select Dept & eid");
				System.out.println("2.select by eid");
				System.out.println("3.select by ename");
				System.out.println("4.select by eDept");
				option=scn.nextInt();scn.nextLine();
				switch(option) {
				case 1:{//select by Dept
					Employee e=new Employee();
					System.out.println("Enter eid");
					e.setEid(scn.nextInt());scn.nextLine();
					System.out.println("Enter Dept");
					e.setDept(scn.nextLine());
					Employee employee=cmp.get(e);
					if(employee==null)
					{
						System.out.println("student not fount as givan details") ;
					}else {
						System.out.println(employee);
					}
					break;
				}
				case 2:{//select by eid
					System.out.println("enter eid");
					LinkedHashSet<Employee>
					lhs=cmp.getByEid(scn.nextInt());scn.nextLine();
					if(lhs.isEmpty()) {
						System.out.println("Student is not found with given eid ");
					}
					else {
						System.out.println("Available Student on give eid");
						System.out.println("=".repeat(30));
						for(Employee employee:lhs) {
							System.out.println(employee);
						}
						System.out.println("=".repeat(30));
					}
					break;
				}
				case 3:{
					System.out.println("enter ename");
					LinkedHashSet<Employee>
					lhs=cmp.getByEname(scn.nextLine());scn.nextLine();
					if(lhs.isEmpty()) {
						System.out.println("Student is not found with given sname");
					}
					else {
						System.out.println("Available Student on give ename");
						System.out.println("=".repeat(30));
						lhs.forEach(e->System.out.println(e));
						System.out.println("=".repeat(30));
					}
					break;
				}
				case 4: {
					System.out.println("enter dept");
					LinkedHashSet<Employee>
					lhs=cmp.getEmployeeByDept(scn.nextLine());scn.nextLine();
					if(lhs.isEmpty()) {
						System.out.println("Student is not found with given dept");
					}
					else {
						System.out.println("Available Student on give dept");
						System.out.println("=".repeat(30));
						lhs.forEach(System.out::println);
						System.out.println("=".repeat(30));
					}
					break;
				}
				default:System.out.println("Invalide option");
				}
				try {Thread.sleep(2000);}
				catch(InterruptedException x) {}
				break;
			}
			case 3:{//Update Employee
				Employee oldEmployee=new Employee();
				Employee newEmployee=new Employee();
				System.out.println("Enter oldEmployee details");
				oldEmployee.setDept(scn.nextLine());
				System.out.println("Eid");
				oldEmployee.setDept(scn.nextLine());scn.nextLine();
				System.out.println("\n enter new value");
				System.out.println("\n which value you want to update");
				System.out.println("Do you want to update code?(Y/N)");
				String opt=scn.next();
				if(opt.equalsIgnoreCase("Y")) {
					System.out.println("Enter new Course");
					newEmployee.setDept(scn.nextLine());
				}
				System.out.println("Do u want to update sal?(Y/N)");
				opt=scn.next();
				if(opt.equalsIgnoreCase("Y")) {
					System.out.println("Enter new Sal");
					newEmployee.setSal(scn.nextDouble());
					scn.hasNextLine();
				}
				System.out.println("Do u want to update Email?(y/N)");
				opt=scn.next();
				if(opt.equalsIgnoreCase("Y")) {
					System.out.println("Enter new Email");
					newEmployee.setEmail(scn.nextLine());
				}
				System.out.println("Do u want to update Mobile?(Y/N)");
				opt=scn.next();
				if(opt.equalsIgnoreCase("Y")) {
					System.out.println("Enter new Mobile");
					newEmployee.setMobile(scn.nextLong());
				}
				boolean update=cmp.setEmployee(oldEmployee, newEmployee);{
					if(update) {
						System.out.println("Employee data is updated");
					}
					else {
						System.out.println("Employee data is not updated");
						System.out.println("is not found with the given Dept eid");
					}
					try {Thread.sleep(2000);}
					catch(InterruptedException x) {}
					break;
				}
			}
			case 4:{//Delete Emp
				Employee employee=new Employee();
				System.out.println("Enter Employee details");
				System.out.println("Dept");
				employee.setDept(scn.nextLine());
				System.out.println("eid");
				employee.setEid(scn.nextInt());scn.nextLine();
				if(cmp.deleteEmployee(employee)) {
					System.out.println("Employee is deleted");
				}
				else {
					System.out.println("Employee is not deleted");
					System.out.println("Employee is not Found with given Dept Eid");
				}
				try {Thread.sleep(2000);}
				catch(InterruptedException x) {}
				break;
			}

			case 5:{//Exit Employee
				System.out.println("Thank you");
				System.exit(0);
			}
			default:
				System.out.println("invalide option ");
			}

		}
	}
}


