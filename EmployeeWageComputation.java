package com.Bridgelab.day9;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class EmployeeWageComputation {
    static Logger logger = Logger.getLogger(EmployeeWageComputation.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Welcome To Employee Wage Computation ");
    }
}
