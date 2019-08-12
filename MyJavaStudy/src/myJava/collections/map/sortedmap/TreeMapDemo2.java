package myJava.collections.map.sortedmap;

import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


class Employee implements Comparable<Object>
{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee employee = (Employee) o;
		if (this.salary > employee.salary) {
			return 1;
		} else if (this.salary < employee.salary) {
			return -1;
		} else
			return 0;
	}
}

public class TreeMapDemo2 {
	
	
	public static void main(String[] args) {
		TreeMap<String, Employee> treemap = new TreeMap<>();
		treemap.put("1004", new Employee(101, "Nikhil", 90000));
		treemap.put("1002", new Employee(102, "Mohit", 30000));
		treemap.put("1001", new Employee(103, "Anurag", 60000));
		treemap.put("1005", new Employee(105, "Vipul", 100000));
		treemap.put("1003", new Employee(104, "Nishant", 80000));
		
		Set<Entry<String, Employee>> set = treemap.entrySet();
		Iterator<Entry<String, Employee>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Employee> entry = iterator.next();
			System.out.println(entry.getKey() + "- "+entry.getValue().id+ "- "+entry.getValue().name+ "- "+entry.getValue().salary);
		}
	}
}
