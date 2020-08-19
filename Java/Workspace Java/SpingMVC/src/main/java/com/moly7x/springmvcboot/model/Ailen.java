//
package com.moly7x.springmvcboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class is .
 * 
 * @author: Tân
 * @create_date: 30/07/2020
 */
@Entity
public class Ailen {

	@Id
	private int aid;
	private String aname;

	public Ailen() {
	}

	public Ailen(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Ailen [aid=" + aid + ", aname=" + aname + "]";
	}

}
