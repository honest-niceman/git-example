package org.example;

import java.math.BigDecimal;

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
}
