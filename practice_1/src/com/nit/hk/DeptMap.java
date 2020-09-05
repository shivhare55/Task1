package com.nit.hk;

import java.util.HashMap;

public class DeptMap {
private static HashMap<String,Integer>deptMap;
static {
  deptMap =new HashMap<>();
  deptMap.put("HR",1);
  deptMap.put("Developer",2);
  deptMap.put("QA",3);
  deptMap.put("PM",4);
  deptMap.put("Tester",5);
	}
	public static int getDept(String Dept) {
	return DeptMap.getDept(Dept.toUpperCase());
	}
	public static void display() {
	System.out.println(deptMap.keySet());
	}
	}	
	


