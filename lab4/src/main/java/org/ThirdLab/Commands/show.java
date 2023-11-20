package org.ThirdLab.Commands;

import org.ThirdLab.Domain.Division;
import org.ThirdLab.Domain.Employee;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class show {

    static public String getCommandName() {
        return CommandName;
    }

    static private final String CommandName = "Show";

    public static void Show(ArrayList<Division> divisions){

        for (Division item: divisions){
            System.out.println("Название отдела:" + item.getName());
            System.out.println("Работники:");
            for (Map.Entry<Integer, Employee> employeeEntry : item.getEmployers().entrySet()) {
                System.out.println("Работник №" + employeeEntry.getKey());
                System.out.println("    Имя работника: " + employeeEntry.getValue().getName());
                System.out.println("    Зарплата : " + employeeEntry.getValue().getSalary());
                System.out.println("    Должность работника:" + employeeEntry.getValue().getPosition());
            }
        }


    }
}
