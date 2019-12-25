package com.example;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name = "";
    private double salary;
    private LocalDate hireDay;

    public Employee() {

    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Employee otherObj = (Employee) obj;
        return Objects.equals(this.name, otherObj.name)
                && this.salary == otherObj.salary
                && Objects.equals(this.hireDay, otherObj.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
        /*return 7 * Objects.hashCode(name)
                + 11 * Double.hashCode(salary)
                + 9 * Objects.hashCode(hireDay);*/
    }
}
