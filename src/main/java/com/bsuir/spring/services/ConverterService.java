package com.bsuir.spring.services;

import com.bsuir.spring.interfaces.YearConverter;

public class ConverterService {
    private YearConverter yearConverter;

    public ConverterService() {
    }

    public ConverterService(YearConverter yearConverter) {
        this.yearConverter = yearConverter;
    }

    public YearConverter getYearConverter() {
        return yearConverter;
    }

    public void setYearConverter(YearConverter yearConverter) {
        this.yearConverter = yearConverter;
    }

}
