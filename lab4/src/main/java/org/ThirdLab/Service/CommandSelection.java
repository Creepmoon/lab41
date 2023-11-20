package org.ThirdLab.Service;


import org.ThirdLab.Commands.*;
import org.ThirdLab.Domain.Division;

import java.io.IOException;
import java.util.ArrayList;

public class CommandSelection {

    static public void select(String CommandName, ArrayList<Division> divisions) throws IOException {
        if(CommandName.equalsIgnoreCase(Exit.getCommandName())){
            Exit.finalProgram();
        }
        else if(CommandName.equalsIgnoreCase(Load.getCommandName())){
            System.out.println("Введите путь к файлу загрузки");
            Load.load(HandInput
                            .Input()
                            .trim(),
                      divisions);
        } else if(CommandName.equalsIgnoreCase(Save.getCommandName())){
            System.out.println("Введите путь к файлу сохранения");

            Save.Save(HandInput
                            .Input()
                            .trim(),
                      divisions
            );
        }
        else if(CommandName.equalsIgnoreCase(AddDivision.getCommandName())){
            AddDivision.AddDiv(divisions);
        }
        else if(CommandName.equalsIgnoreCase(AddEmployee.getCommandName())){
            AddEmployee.AddEmp(divisions);
        }
        else if(CommandName.equalsIgnoreCase(Help.getCommandName())){
            Help.help();
        }
        else if(CommandName.equalsIgnoreCase(show.getCommandName())){
            show.Show(divisions);
        }
    }


}
