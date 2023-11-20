package org.ThirdLab.Commands;

public class Help{

    static public String getCommandName() {
        return CommandName;
    }

    static private final String CommandName = "Help";

    public static void help(){
        System.out.println(
                AddDivision.getCommandName() + "\n" +
                        AddEmployee.getCommandName() + "\n" +
                        Exit.getCommandName() + "\n" +
                        Load.getCommandName() + "\n" +
                        Save.getCommandName() + "\n"
        );
    }


}
