package org.ThirdLab.Commands;

public class Exit {


    static public String getCommandName() {
        return CommandName;
    }

   static private final String CommandName = "exit";


   static public void finalProgram(){
        System.exit(0);
    }

}
