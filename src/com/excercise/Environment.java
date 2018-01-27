package com.excercise;

import java.util.ArrayList;

public class Environment {
    private String date;
    private String time;
    private String air_temp;
    private String barometric_press;
    private String dew_point;
    private String relative_humidity;
    private String wind_dir;
    private String wind_gust;
    private String wind_speed;
    private double Air_Temp_avg;
    private double Air_Temp_median;
    private double Barometric_Press_avg;
    private double Barometric_Press_median;
    private double Wind_Speed_avg;
    private double Wind_Speed_median;
    private ArrayList<Environment> environmentObjectList = new ArrayList<>();
    private Metrics metric;

    public Environment(){}

    public Environment(String date, String time, String air_temp, String barometric_press, String dew_point, String relative_humidity, String wind_dir, String wind_gust, String wind_speed){
        this.date = date;
        this.time = time;
        this.air_temp = air_temp;
        this.barometric_press = barometric_press;
        this.dew_point = dew_point;
        this.relative_humidity = relative_humidity;
        this.wind_dir = wind_dir;
        this.wind_gust = wind_gust;
        this.wind_speed = wind_speed;
    }

    public void printEnvironmentInfo(){
        System.out.println(
                "\nEnvironment info:" +
                        "\n" + this.date +
                        "\n" + this.time +
                        "\n" + this.air_temp +
                        "\n" + this.barometric_press +
                        "\n" + this.dew_point +
                        "\n" + this.relative_humidity +
                        "\n" + this.wind_dir +
                        "\n" + this.wind_gust +
                        "\n" + this.wind_speed
        );
    }

    public void setEnvironmentObjectList(ArrayList<Environment> environmentObjectList) throws NoResultException {
        this.metric = new Metrics(environmentObjectList);
    }

    public ArrayList<Environment> getEnvironmentObjectList(){
        return this.environmentObjectList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAir_temp() {
        return air_temp;
    }

    public void setAir_temp(String air_temp) {
        this.air_temp = air_temp;
    }

    public String getBarometric_press() {
        return barometric_press;
    }

    public void setBarometric_press(String barometric_press) {
        this.barometric_press = barometric_press;
    }

    public String getDew_point() {
        return dew_point;
    }

    public void setDew_point(String dew_point) {
        this.dew_point = dew_point;
    }

    public String getRelative_humidity() {
        return relative_humidity;
    }

    public void setRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public String getWind_gust() {
        return wind_gust;
    }

    public void setWind_gust(String wind_gust) {
        this.wind_gust = wind_gust;
    }

    public String getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }

    public double getAir_Temp_avg() {
        return this.metric.getAir_Temp_avg();
    }

    public double getAir_Temp_median() {
        return this.metric.getAir_Temp_median();
    }

    public double getBarometric_Press_avg() {
        return this.metric.getBarometric_Press_avg();
    }

    public double getBarometric_Press_median() {
        return this.metric.getBarometric_Press_median();
    }

    public double getWind_Speed_avg() {
        return this.metric.getWind_Speed_avg();
    }

    public double getWind_Speed_median() {
        return this.metric.getWind_Speed_median();
    }
}
