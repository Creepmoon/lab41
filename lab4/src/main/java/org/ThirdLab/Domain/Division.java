package org.ThirdLab.Domain;

import org.ThirdLab.PositionType;

import java.util.HashMap;
import java.util.Map;

public class Division {
    private String Name;
    private Map<Integer, Employee> Employers = new HashMap<Integer,Employee>();

    public Map<Integer, Employee> getEmployers() {
        return Employers;
    }

    public void setEmployers(Map<Integer, Employee> employers) {
        Employers = employers;
    }
    private Employee HeadOfDivision;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Employee getHeadOfDivision() {
        return HeadOfDivision;
    }

    public void setHeadOfDivision(Employee headOfDivision) {
        if (headOfDivision.getPosition().equals(PositionType.HEAD)){
            HeadOfDivision = headOfDivision;
    }
    }
}
