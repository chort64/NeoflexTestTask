package com.test.task.neoflextask.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.test.task.neoflextask.model.Employee;
import com.test.task.neoflextask.model.OwnDate;

@Service
public class EmployeeService {

    public Boolean isWeekendDate(OwnDate date) {
        return WeekendService.getAllWeekends().contains(date);
    }

    public Long getCountOfVacationDaysWithoutWeekends(OwnDate vacationDays[]) {
        return Arrays.stream(vacationDays)
                     .filter(e -> !isWeekendDate(e))
                     .count();
    }

    public Double getVacationPay(Employee employee) {
        Integer averageSalary = employee.getAverageSalaryForYear();
        OwnDate vacationDays[] = employee.getVacationDays();
        Long daysCount = getCountOfVacationDaysWithoutWeekends(vacationDays);
                 
        return daysCount > 0 ? (1.0 * averageSalary / daysCount / 28.3) : 0;
    }
}
