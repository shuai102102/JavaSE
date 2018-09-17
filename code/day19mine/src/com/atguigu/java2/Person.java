package com.atguigu.java2;

public class Person {
	
	private int age;
	private String name;
	
	public Person(){
		
	}
	
	public Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	
	public String toString(){
		return name + " " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
		
		if(getClass() != obj.getClass())
			return false;
		
		Person other = (Person)obj;
		if(age != other.age)
			return false;
		
		if(name == null){
			if(other.name != null)
				return false;
		}else if(!name.equals(other.name))
			return false;
		
			return true;
	
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null)?0 : name.hashCode());
		return result;
	
	}
}
