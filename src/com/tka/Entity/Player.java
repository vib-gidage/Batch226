package com.tka.Entity;

public class Player {
	
	private int jn;
	private String Name;
	private int runs;
	private int wickets;
	private String tname;
	
	
	public Player() {
		super();
	}


	public Player(int jn, String name, int runs, int wickets, String tname) {
		super();
		this.jn = jn;
		this.Name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.tname = tname;
	}


	public int getJn() {
		return jn;
	}


	public void setJn(int jn) {
		this.jn = jn;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	@Override
	public String toString() {
		return "Player [jn=" + jn + ", Name=" + Name + ", runs=" + runs + ", wickets=" + wickets + ", tname=" + tname+ "]";
		
	}	

}











