package com.bsuir.spring;

import com.bsuir.spring.interfaces.YearConverter;

import java.time.Year;

public class ConvertYearToDays implements YearConverter {
    private Integer num_of_years;

    public ConvertYearToDays(Integer num_of_years) {
        this.num_of_years = num_of_years;
    }

    @Override
    public String convert() {
        return String.valueOf(Year.of( this.num_of_years ).length());
    }
}
