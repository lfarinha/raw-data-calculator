package com.excercise;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class MetricsTest {

    @org.junit.Test
    public void calculateMean() {
    }

    @org.junit.Test
    public void calculateMedian() throws FileNotFoundException, NoResultException {
        Upload upload = new Upload();
        upload.readFile("c:/Environmental_Data_Deep_Moor_2012_test.txt");
        upload.getEnvironment().setEnvironmentObjectList(upload.getEnvironmentObjectList());
    }
}