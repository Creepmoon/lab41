package org.ThirdLab.Service;

import org.ThirdLab.Domain.Division;
import org.ThirdLab.Domain.Employee;
import org.ThirdLab.PositionType;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class InputFileSystem extends IOService {


    public static Map<Integer, Employee> loadEmployee(String filename, Map<Integer,Employee> Employees) throws IOException {
        Path path = Paths.get(filename);
        Scanner Reader = new Scanner(path);
        while(Reader.hasNextLine()){
            String string[] = Reader.nextLine().split(";");
            Employee employee = new Employee();
            employee.setName(string[1]);
            employee.setSalary(Integer.parseInt(string[2]));
            employee.setPosition(fromString(string[3]));
            Integer Key = Integer.parseInt(string[0]);
            Employees.put(Key,employee);
        }
        return null;
    }
    static public ArrayList<Division> load(String filename, ArrayList<Division> divisions) throws IOException {
        Path path = Paths.get(filename);
        Scanner Reader = new Scanner(path);
        while(Reader.hasNextLine()){
            Division division = new Division();
            String string[] = Reader.nextLine().split(";");
            division.setName(string[0]);
            loadEmployee(PathFile(filename)+"\\"+string[1], division.getEmployers());
            for (Map.Entry<Integer,Employee> item: division.getEmployers().entrySet()) {
                if(item.getValue().getPosition().equals(PositionType.HEAD)){
                    division.setHeadOfDivision(item.getValue());
                }
            }
            divisions.add(division);
        }
        Reader.close();
        return divisions;
    }

    public static PositionType fromString(String string){
        if(string != null){
            for(PositionType pt: PositionType.values()){
                if(string.equalsIgnoreCase(String.valueOf(pt))){
                    return pt;
                }
            }
        }
        throw new IllegalArgumentException("NotFound");
    }


}
