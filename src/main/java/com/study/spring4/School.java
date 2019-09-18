package com.study.spring4;

public class School {
	private String sname;
	private String saddress;

	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(String sname, String saddress) {
		super();
		this.sname = sname;
		this.saddress = saddress;
	}

	public final String getSname() {
		return sname;
	}

	public final void setSname(String sname) {
		this.sname = sname;
	}

	public final String getSaddress() {
		return saddress;
	}

	public final void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "School [sname=" + sname + ", saddress=" + saddress + "]";
	}

}
