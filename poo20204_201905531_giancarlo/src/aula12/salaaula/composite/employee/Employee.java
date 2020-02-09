package aula12.salaaula.composite.employee;

public interface Employee {
	String name = null;
	double salary = 0d;
	void add(Employee employee);
	void remove(Employee employee);
	Employee getChild(int i);
	String getName();
	double getSalary();
	void print();
}
