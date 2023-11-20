package org.ThirdLab.Service;

import java.util.Scanner;

public class HandInput {

   static public String Input(){
        String string;
        Scanner scanner = new Scanner(System.in);
        string= scanner.nextLine().trim().toLowerCase();
        return string;

    }


}
