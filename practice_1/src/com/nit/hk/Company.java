package com.nit.hk;

import java.util.LinkedHashSet;
public class Company{
private LinkedHashSet<Employee> employeeSet;
public Company() {
employeeSet =new LinkedHashSet<>();
	}
//insert operation
public boolean join(Employee e) {
return this.employeeSet.add(e);
}
//search operation by dept &amp; eid
public boolean find(Employee e) {
return this.employeeSet.contains(e);
}
//select operation by dept &amp; eid
public Employee get(Employee e)
	{
for(Employee ele: employeeSet) {
if(ele!=null && e.equals(ele)) {
return e;
}
	}
return null;
}
//select operation by Dept
public LinkedHashSet<Employee> getEmployeeByDept(String dept){
LinkedHashSet<Employee> lhs=new LinkedHashSet<>();
	for(Employee e: employeeSet) {
	if(e!=null && e.getDept().equals(dept))
	lhs.add(e);
	}
	return lhs;
	}
	//update operation by
	public boolean setEmployee(Employee oldEmployee, Employee newEmployee) {
	for(Employee e: employeeSet)
	{
	if(e!=null && oldEmployee.equals(e)) {
	String ename=newEmployee.getEname();
	if(ename!=null)

	e.setEname(ename);
	String Dept=newEmployee.getDept();
	if(Dept!=null)
	e.setDept(Dept);

	double sal=newEmployee.getSal();
	if(sal!=0)
	e.setSal(sal);

	String email=newEmployee.getEmail();
	if(email!=null)
	e.setEmail(email);
	long mobile=newEmployee.getMobile();
	if(mobile!=0)
	e.setMobile(mobile);
	return true;
	}//if close
	}//for close
	return false;
	}//setEmployee close
	//delete
	public boolean deleteEmployee(Employee e) {
	return employeeSet.remove(e);
	}
	//select and display
	public void display() {
	for(Employee e: employeeSet) {
	System.out.println(e);
	}
	}
	public LinkedHashSet<Employee>getByEname(String nextLine) {
	// TODO Auto-generated method stub
	return null;
	}
	public LinkedHashSet<Employee> getByEid(int nextInt) {
	// TODO Auto-generated method stub
	return null;
	}
	}

