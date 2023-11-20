package org.ThirdLab.Domain;

import org.ThirdLab.Domain.Division;
import org.ThirdLab.PositionType;

public class Employee {
     private String Name;
     private int salary;

    public PositionType getPosition() {
        return position;
    }

    public void setPosition(PositionType position) {
        this.position = position;
    }

    private PositionType position;

    public String getName() {
        return Name;
    }

    public void setName(String name){
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    private Division division;
}
