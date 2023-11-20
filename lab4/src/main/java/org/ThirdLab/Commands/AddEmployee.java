package org.ThirdLab.Commands;

import org.ThirdLab.Domain.Division;
import org.ThirdLab.Domain.Employee;
import org.ThirdLab.PositionType;
import org.ThirdLab.Service.HandInput;
import org.ThirdLab.Service.InputFileSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddEmployee {

    static public String getCommandName() {
        return CommandName;
    }

    static private final String CommandName = "Add Employee";


    public static void AddEmp(ArrayList<Division> divisions){

        if (divisions.isEmpty()){
            System.out.println("Нету отделов куда добавить сотрудника");
        }
        else {

            Employee employee = new Employee();
            System.out.println("Введите имя работника");
            employee.setName(HandInput.Input());
            System.out.println(

                           " Выберите Должность работника \n" +
                            " 1)WORKER\n " +
                            " 2)MANAGER\n"+
                            " 3)SALESMAN\n"+
                            " 4)HEAD");

            int NumberOfPositionType = Integer.parseInt(HandInput.Input())-1;
            for (PositionType pt : PositionType.values()) {
                if (pt.ordinal() == NumberOfPositionType) {
                    employee.setPosition(pt);
                }
            }
            System.out.println("Введите Зарплату работника");
            employee.setSalary(Integer.parseInt(HandInput.Input()));
            System.out.println("Выберите Подразделение работника");
            for (Division item : divisions) {
                System.out.println(item.getName());
            }
            String fromUser = HandInput.Input() ;
            for (Division item : divisions) {
                if (item.getName().equalsIgnoreCase(fromUser)){
                    System.out.println(item.getName());
                    employee.setDivision(item);
                    System.out.println("Введите ID Работника");
                    String Id = HandInput.Input();
                    item.getEmployers().put(Integer.parseInt(Id), employee);
                    if(employee.getPosition().equals(PositionType.HEAD)){
                        item.setHeadOfDivision(employee);
                    }
                }
            }


        }



    }


}
