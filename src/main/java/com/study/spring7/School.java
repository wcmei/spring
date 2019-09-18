package com.study.spring7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("school")
public class School {
	@Value("桂电")
	private String sname;
	@Value("桂林")
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
