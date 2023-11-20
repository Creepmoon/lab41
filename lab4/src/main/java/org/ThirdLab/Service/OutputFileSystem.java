package org.ThirdLab.Service;

import org.ThirdLab.Domain.Division;
import org.ThirdLab.Domain.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class OutputFileSystem extends IOService {


    public static void SaveEmployee(Map<Integer, Employee> employeeMap,String filename) {

        try {
          FileWriter writer = new FileWriter(filename);
            for (Map.Entry<Integer, Employee> item : employeeMap.entrySet()) {
                writer.write(item.getKey() + ";");
                writer.write(item.getValue().getName() + ";");
                writer.write(item.getValue().getSalary() + ";");
                writer.write(item.getValue().getPosition() + ";");
                writer.write("\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Save(String filename,ArrayList<Division> divisions){
        try {
            FileWriter writer = new FileWriter(filename, true);
            for (Division item: divisions){
                writer.write(item.getName()+";");
                SaveEmployee(item.getEmployers(),  PathFile(filename)+ "\\"+ item.getName()+ ".csv");
                writer.write(item.getName()+".csv");
                writer.write("\n");
            }
            writer.close();
            }
        catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");        } catch (IOException e) {
            throw new RuntimeException(e);
    }

}
}
