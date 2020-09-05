package com.nit.hk;

import java.io.Serializable;

public class Employee implements Serializable {
private static final long serialVersionUID = 1L ;
private int eid;
private String ename;
private String dept;
private String email;
private double sal;
private long mobile;
public int getEid() {
return eid;
}
public void setEid(int eid) {
this.eid = eid;
}
public String getEname() {
return ename;
}
public void setEname(String ename) {
this.ename = ename;
}
public String getDept() {
return dept;
}
public void setDept(String dept) {
dept = dept;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public double getSal() {
return sal;
}
public void setSal(double sal) {
this.sal = sal;
}
public long getMobile() {
return mobile;
}
public void setMobile(long mobile) {
this.mobile = mobile;
}
@Override

public int hashCode() {
return DeptMap.getDept(dept);
}
@Override
public boolean equals(Object obj) {
if(obj instanceof Employee) {
Employee e=(Employee)obj;
return this.dept.equals(e.dept)&&
this .eid==e.eid;
}
return false;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", email=" + email + ", sal=" + sal
			+ ", mobile=" + mobile + "]";
}

}




