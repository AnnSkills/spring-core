package com.bsuir.spring;

import com.bsuir.spring.interfaces.YearConverter;

public class ConvertYearToMonths implements YearConverter {
    private Integer number_of_years;

    public ConvertYearToMonths() {
    }
    public ConvertYearToMonths(Integer number_of_years) {
        this.number_of_years = number_of_years;
    }
    @Override
    public String  convert() {
        return String.valueOf(this.number_of_years * 12);
    }
}
