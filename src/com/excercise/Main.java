package com.excercise;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, NoResultException {
        Upload upload = new Upload();
        upload.readFile("c:/Environmental_Data_Deep_Moor_2012.txt");



        upload.getEnvironment().setEnvironmentObjectList(upload.getEnvironmentObjectList());
        System.out.println("----------------------------------------\n"+"Median results:\n"+
                "Air Temperature " + upload.getEnvironment().getAir_Temp_median() + "\n" +
                            "Barometric pressure " + upload.getEnvironment().getBarometric_Press_median() + "\n" +
                                "Wind Speed " + upload.getEnvironment().getWind_Speed_median() + "\n----------------------------------------");

        System.out.println("----------------------------------------\n"+"Mean results:\n"+
                "Air Temperature " + upload.getEnvironment().getAir_Temp_avg() + "\n" +
                "Barometric pressure " + upload.getEnvironment().getBarometric_Press_avg() + "\n" +
                "Wind Speed " + upload.getEnvironment().getWind_Speed_avg() + "\n----------------------------------------");
    }
}
