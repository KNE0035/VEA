package vea2017.dto;

public class Person {
	private String name;
	private String surname;
	private int sallary;
	private int id;
	private static int nextId = 1;
	
	
	public Person() {
		this.id = nextId;
		nextId++;
	}
	
	public Person(String name, String surname, int sallary) {
		this.name = name;
		this.id = nextId;
		this.surname = surname;
		this.sallary = sallary;
		nextId++;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNextId() {
		return nextId;
	}
	
	public int getSallary() {
		return sallary;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setNextId(int nextId) {
		this.nextId = nextId;
	}
	
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	
	public void setSurname(String surName) {
		this.surname = surName;
	}
}
