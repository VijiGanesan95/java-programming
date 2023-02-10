package com.springframework.springsample;

public class Employee {
	 int eid;
	    String ename;
	    Address eaddress;
	    public Employee() {
	    	
	    }

	    public Employee(int eid, String ename, Address eaddress) {
	        this.eid = eid;
	        this.ename = ename;
	        this.eaddress = eaddress;
	    }

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

	    public Address getEaddress() {
	        return eaddress;
	    }

	    public void setEaddress(Address eaddress) {
	        this.eaddress = eaddress;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "eid=" + eid +
	                ", ename='" + ename + '\'' +
	                ", eaddress=" + eaddress +
	                '}';
	    }
	    public void myInit() {
	    	System.out.println("-------------------Object created----------------");
	    }
	    public void myDestroy() {
	    	System.out.println("-------------------Object destroyed----------------");
	    }
}

