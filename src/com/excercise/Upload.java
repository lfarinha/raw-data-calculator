package com.excercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Upload {
    private Scanner scan;
    private File file;
    private Environment environment;
    private ArrayList<Environment> environmentObjectList = new ArrayList<>();

    public void readFile(String path) throws FileNotFoundException, NoResultException {
        this.file = new File(path);
        this.scan = new Scanner(this.file);
        boolean firstLine = true;
        while(this.scan.hasNext()){
            if(firstLine){
                this.scan.nextLine();
                firstLine = false;
            }
            String line = this.scan.nextLine(); //verify this gets the first line and not the second one
            environment = new Environment(
                    line.substring(0,10).trim(),
                    line.substring(11,19).trim(),
                    line.substring(20,25).trim(),
                    line.substring(26,31).trim(),
                    line.substring(32,37).trim(),
                    line.substring(38,43).trim(),
                    line.substring(44,50).trim(),
                    line.substring(51,56).trim(),
                    line.substring(56,line.length()).trim()
            );
            this.environmentObjectList.add(environment);
//            environment.printEnvironmentInfo();
        }
    }

    public Environment getEnvironment() {
        return environment;
    }

    public ArrayList<Environment> getEnvironmentObjectList() {
        return environmentObjectList;
    }
}
