package com.test.task.neoflextask.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private Integer averageSalaryForYear;
    private OwnDate vacationDays[];
    
}
