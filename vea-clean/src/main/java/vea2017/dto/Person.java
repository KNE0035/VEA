package vea2017.dto;

public class Person {
	private String name;
	private int id;
	private int nextId = 1;
	
	public Person() {
		this.id = nextId;
		nextId++;
	}
	
	public Person(String name) {
		this.name = name;
		this.id = nextId;
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
}
