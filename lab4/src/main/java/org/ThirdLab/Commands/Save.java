package org.ThirdLab.Commands;

import org.ThirdLab.Domain.Division;
import org.ThirdLab.Domain.Employee;
import org.ThirdLab.Service.OutputFileSystem;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Save extends OutputFileSystem {

    static public String getCommandName() {
        return CommandName;
    }

    static private final String CommandName = "save";

}
