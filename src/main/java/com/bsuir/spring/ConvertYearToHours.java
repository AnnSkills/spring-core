package com.bsuir.spring;

import com.bsuir.spring.interfaces.YearConverter;

public class ConvertYearToHours implements YearConverter {

    private Integer year;

    public ConvertYearToHours(Integer year) {
        this.year = year;
    }
    @Override
    public String convert() {
        return String.valueOf(this.year* 8765);
    }
}
