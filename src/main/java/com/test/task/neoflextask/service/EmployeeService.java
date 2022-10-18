package com.test.task.neoflextask.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.test.task.neoflextask.model.Employee;
import com.test.task.neoflextask.model.MyDate;

@Service
public class EmployeeService {

    public Boolean isWeekendDate(MyDate date) {
        return WeekendService.getAllWeekends().contains(date);
    }

    public Long getCountOfVacationDaysWithoutWeekends(MyDate vacationDays[]) {
        return Arrays.stream(vacationDays)
                     .filter(e -> !isWeekendDate(e))
                     .count();
    }

    public Double getVacationPay(Employee employee) {
        Integer averageSalary = employee.getAverageSalaryForYear();
        MyDate vacationDays[] = employee.getVacationDays();
        Long daysCount = getCountOfVacationDaysWithoutWeekends(vacationDays);
                 
        return daysCount > 0 ? (1.0 * averageSalary / daysCount / 28.3) : 0;
    }
}
