package com.bsuir.spring;

import com.bsuir.spring.interfaces.YearConverter;

public class ConvertYearsToSeconds implements YearConverter {

    private Integer year;

    public ConvertYearsToSeconds(Integer year) {
        this.year = year;
    }
    @Override
    public String convert() {
        return String.valueOf(this.year*31556952);
    }
}
