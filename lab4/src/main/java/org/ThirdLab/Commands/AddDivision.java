package org.ThirdLab.Commands;

import org.ThirdLab.Domain.Division;
import org.ThirdLab.Service.HandInput;

import java.util.ArrayList;

public class AddDivision {
    static public String getCommandName() {
        return CommandName;
    }

    static private final String CommandName = "Add Division";

    public static void AddDiv(ArrayList<Division> divisions){
        Division division = new Division();
        System.out.println("Введите название отдела");
        division.setName(HandInput.Input());
        divisions.add(division);
    }






}
