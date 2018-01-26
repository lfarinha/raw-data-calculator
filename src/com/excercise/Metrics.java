package com.excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Metrics {

    private double total;
    private int isEven;
    private double Air_Temp_avg;
    private double Air_Temp_median;
    private double Barometric_Press_avg;
    private double Barometric_Press_median;
    private double Dew_Point_avg;
    private double Dew_Point_median;
    private double Relative_Humidity_avg;
    private double Relative_Humidity_median;
    private double Wind_Dir_avg;
    private double Wind_Dir_median;
    private double Wind_Gust_avg;
    private double Wind_Gust_median;
    private double Wind_Speed_avg;
    private double Wind_Speed_median;
    private List values = new ArrayList<Environment>();

    public Metrics(double Air_Temp_avg, double Barometric_Press_avg, double Dew_Point_avg, double Relative_Humidity_avg, double Wind_Dir_avg, double Wind_Gust_avg, double Wind_Speed_avg, double Air_Temp_median, double Barometric_Press_median, double Dew_Point_median, double Relative_Humidity_median, double Wind_Dir_median, double Wind_Gust_median, double Wind_Speed_median){
        this.Air_Temp_avg = Air_Temp_avg;
        this.Barometric_Press_avg = Barometric_Press_avg;
        this.Dew_Point_avg = Dew_Point_avg;
        this.Relative_Humidity_avg = Relative_Humidity_avg;
        this.Wind_Dir_avg = Wind_Dir_avg;
        this.Wind_Gust_avg = Wind_Gust_avg;
        this.Wind_Speed_avg = Wind_Speed_avg;
        this.Air_Temp_median = Air_Temp_median;
        this.Barometric_Press_median = Barometric_Press_median;
        this.Dew_Point_median = Dew_Point_median;
        this.Relative_Humidity_median = Relative_Humidity_median;
        this.Wind_Dir_median = Wind_Dir_median;
        this.Wind_Gust_median = Wind_Gust_median;
        this.Wind_Speed_median = Wind_Speed_median;
    }


    public int isEven(ArrayList<Environment> values){
        return this.isEven = (values.size()%2==0) ? 1 : 0; //verifies if the amount of values in the list is even or not
    }

    public void defineValueList(ArrayList<Environment> values){
        for(int i=0; i<values.size(); i++) {
            this.values.add(values.get(i).getAir_temp());
        };
        Collections.sort(this.values);
    }

    public void setTotal(ArrayList<Environment> values) throws NoResultException {
        switch (this.isEven(values)){
            case 0: this.defineValueList(values);
                    int median;
//                    System.out.println("isEven is: " + this.isEven);
                    median = ((values.size()+1)/2);
                    this.total = Double.parseDouble(this.values.get(median-1).toString());
//                    System.out.println("The median is: " +this.values.get(median));
                    break;
            case 1: double mean = 0.0;
//                    System.out.println("isEven is: " + this.isEven);
                    for(int i=0; i<values.size(); i++){
                        mean += Double.parseDouble(values.get(i).getAir_temp());

                    }
                    this.total = mean/values.size();
                    break;
            default: throw new NoResultException("Something is wrong in the isEven validation");
        }
    }

    public double getTotal(){
        return this.total;
    }
}
