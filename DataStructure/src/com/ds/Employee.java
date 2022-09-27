package com.ds;

public class Employee implements Comparable<Employee>{
	
	Integer id;
	String name;
	Integer salary;
	
	public Employee(Integer id, String name, int i) {
		super();
		this.id = id;
		this.name = name;
		this.salary = i;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Employee emp1) {
	
		if(this.getId()<emp1.getId()){
			return -1;
		}
		else if(this.getId()==emp1.getId()){
			return 0;
		}
			return 1;
		
	}
	
}
