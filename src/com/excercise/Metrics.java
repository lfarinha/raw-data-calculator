package com.excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Metrics {
    private int isEven;
    private List<Double> windSpeedValues = new ArrayList<>();
    private List<Double> airTempValues = new ArrayList<>();
    private List<Double> barometricPressureValues = new ArrayList<>();
    private double Air_Temp_avg;
    private double Air_Temp_median;
    private double Barometric_Press_avg;
    private double Barometric_Press_median;
    private double Wind_Speed_avg;
    private double Wind_Speed_median;

    private ArrayList<Environment> environmentObjectList;

    public Metrics(ArrayList<Environment> environmentObjectList) throws NoResultException {
        this.environmentObjectList = environmentObjectList;
        this.calculateMean();
        this.calculateMedian();
    }

    public int isEven(){
        return this.isEven = (this.environmentObjectList.size()%2==0) ? 1 : 0; //verifies if the amount of windSpeedValues in the list is even or not
    }

    public void defineValueList(){
        for(int i=0; i<this.environmentObjectList.size(); i++) {
            this.windSpeedValues.add(Double.parseDouble(this.environmentObjectList.get(i).getWind_speed()));
            this.airTempValues.add(Double.parseDouble(this.environmentObjectList.get(i).getAir_temp()));
            this.barometricPressureValues.add(Double.parseDouble(this.environmentObjectList.get(i).getBarometric_press()));
        };
        Collections.sort(this.windSpeedValues);
        System.out.println(this.windSpeedValues);
        Collections.sort(this.airTempValues);
        Collections.sort(this.barometricPressureValues);
    }

    public void calculateMean(){
        List<Double> list = new ArrayList<>();
        double meanAirTemp = 0.0, meanWindSpeed = 0.0, meanBaroPress = 0.0;
//      System.out.println("isEven is: " + this.isEven);
        for(int i=0; i<this.environmentObjectList.size(); i++){
            meanAirTemp += Double.parseDouble(this.environmentObjectList.get(i).getAir_temp());
            meanWindSpeed += Double.parseDouble(this.environmentObjectList.get(i).getWind_speed());
            meanBaroPress += Double.parseDouble(this.environmentObjectList.get(i).getBarometric_press());
        }

        meanAirTemp = Math.floor((meanAirTemp/(this.environmentObjectList.size()-1))*100)/100;
        meanWindSpeed = Math.floor((meanWindSpeed/(this.environmentObjectList.size()-1))*100)/100;
        meanBaroPress = Math.floor((meanBaroPress/(this.environmentObjectList.size()-1))*100)/100;

        this.setAir_Temp_avg(meanAirTemp);
        this.setWind_Speed_avg(meanWindSpeed);
        this.setBarometric_Press_avg(meanBaroPress);
    }

    public void calculateMedian() throws NoResultException {
        switch (this.isEven()){
            case 0: this.defineValueList();
                        int oddMedian;
                      System.out.println("isEven is: " + this.isEven);
                        oddMedian = Math.round(((this.environmentObjectList.size()+1)/2));
                        this.setAir_Temp_median(
                                Double.parseDouble(this.airTempValues.get(oddMedian-1).toString())
                        );
                        this.setBarometric_Press_median(
                                Double.parseDouble(this.barometricPressureValues.get(oddMedian-1).toString())
                        );
                        this.setWind_Speed_median(
                                Double.parseDouble(this.windSpeedValues.get(oddMedian-1).toString())
                        );
                      System.out.println("The median is: " +this.windSpeedValues.get(oddMedian-1) + " - - " + oddMedian);
                    break;
            case 1: this.defineValueList();
                    int median;
//                  System.out.println("isEven is: " + this.isEven);
                    median = (Math.round((this.environmentObjectList.size()+1)/2)-1);
                    this.setAir_Temp_median((
                            Double.parseDouble(this.airTempValues.get(median).toString()))
                    );
                    this.setBarometric_Press_median((Double.parseDouble(this.barometricPressureValues.get(median).toString()))
                    );
                    this.setWind_Speed_median((Double.parseDouble(this.windSpeedValues.get(median).toString()))
                    );
                  System.out.println("The median is: " +this.windSpeedValues.get(median) + " - - " + median);
            default: throw new NoResultException("Something is wrong in the isEven validation");
        }
    }

    public double getAir_Temp_avg() {
        return Air_Temp_avg;
    }

    private void setAir_Temp_avg(double air_Temp_avg) {
        Air_Temp_avg = air_Temp_avg;
    }

    public double getAir_Temp_median() {
        return Air_Temp_median;
    }

    private void setAir_Temp_median(double air_Temp_median) {
        Air_Temp_median = air_Temp_median;
    }

    public double getBarometric_Press_avg() {
        return Barometric_Press_avg;
    }

    private void setBarometric_Press_avg(double barometric_Press_avg) {
        Barometric_Press_avg = barometric_Press_avg;
    }

    public double getBarometric_Press_median() {
        return Barometric_Press_median;
    }

    private void setBarometric_Press_median(double barometric_Press_median) {
        Barometric_Press_median = barometric_Press_median;
    }

    public double getWind_Speed_avg() {
        return Wind_Speed_avg;
    }

    private void setWind_Speed_avg(double wind_Speed_avg) {
        Wind_Speed_avg = wind_Speed_avg;
    }

    public double getWind_Speed_median() {
        return Wind_Speed_median;
    }

    private void setWind_Speed_median(double wind_Speed_median) {
        Wind_Speed_median = wind_Speed_median;
    }
}
