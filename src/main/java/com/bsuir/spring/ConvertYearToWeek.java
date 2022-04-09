package com.bsuir.spring;

import com.bsuir.spring.interfaces.YearConverter;

public class ConvertYearToWeek implements YearConverter {

    private Integer number_of_years;

    public ConvertYearToWeek() {
    }

    public ConvertYearToWeek(Integer number_of_years) {
        this.number_of_years = number_of_years;
    }

    @Override
    public String  convert() {
        if(this.number_of_years%7==0){
            return String.valueOf(this.number_of_years/7);
        }
        else {
            return (this.number_of_years/7) + " weeks " + (this.number_of_years%7) + " days";
        }
    }
}
