package entities;

import java.util.List;

public class Funcionarios {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public void incraseSalary(double percent) {
		
		this.salary += salary * percent/100;
	}
	
	public Integer position(List<Funcionarios> list, int id) {
		for(int i = 0; i <list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
