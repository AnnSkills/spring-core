package com.bsuir.spring;

import com.bsuir.spring.services.ConverterService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    private static final String CONFIG_PATH = "yearConfig.xml";
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH);
        ConverterService service = (ConverterService) context.getBean("converterService");
        System.out.println( "5 years consists of "+service.getYearConverter().convert() + " months");

        ConverterService serviceWeeks = (ConverterService) context.getBean("converterService2");
        System.out.println("there were "+ serviceWeeks.getYearConverter().convert() + " in 2020");

        ConverterService serviceDays = (ConverterService) context.getBean("converterService3");
        System.out.println("Days in 2020: " + serviceDays.getYearConverter().convert());

        ConverterService serviceHours = (ConverterService) context.getBean("convertService4");
        System.out.println("Hours in 5 years: " + serviceHours.getYearConverter().convert());

        ConverterService serviceSeconds = (ConverterService) context.getBean("convertService5");
        System.out.println("Seconds in 5 years: " + serviceSeconds.getYearConverter().convert());

    }
}
