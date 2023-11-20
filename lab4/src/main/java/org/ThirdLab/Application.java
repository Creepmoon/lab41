package org.ThirdLab;


import org.ThirdLab.Domain.Division;
import org.ThirdLab.Service.CommandSelection;
import org.ThirdLab.Service.HandInput;

import java.io.IOException;
import java.util.ArrayList;

public class Application {


    public static void main(final String[] args) throws IOException {

        ArrayList<Division> divisions = new ArrayList<>();

        while(true){
            System.out.println("Введите команду");
            CommandSelection.select(HandInput.Input(),divisions);
        }
    }

}

