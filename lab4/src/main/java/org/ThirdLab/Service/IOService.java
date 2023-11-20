package org.ThirdLab.Service;

public class IOService{
    public static String PathFile(String string){
        string = string.substring(0, string.lastIndexOf('\\'));

        return string;
    }
}
