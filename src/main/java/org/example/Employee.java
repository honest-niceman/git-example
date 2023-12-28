package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    private BigDecimal salary;
    private String name;

    public Employee(BigDecimal salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name);
    }
}
