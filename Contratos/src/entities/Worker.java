package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
	private String name;
	private WorkLevel level;
	private double baseSalary;
	
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}
	
	public Worker(String name, WorkLevel level, double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}
	
	
	public List<HourContract> getContracts() {
		return contracts;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract){
		contracts.remove(contract);
	}
	public Double income(Integer year, Integer month) {
		double soma = baseSalary;
		
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());  //pegando a data do contrato e passand ela para a da do calendario
			
			int cYear = cal.get(Calendar.YEAR);
			int cMonth = 1+  cal.get(Calendar.MONTH);
			
			  if( cYear == year && cMonth == month) {
				  soma += c.totalValue();
			  }
		}
	return soma;
	}
}
