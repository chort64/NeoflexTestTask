package com.test.task.neoflextask.service;

import java.util.Arrays;
import java.util.HashSet;

import com.test.task.neoflextask.model.MyDate;

public class WeekendService {
    
    static public HashSet<MyDate> getAllWeekends() {
        MyDate allWeekends[] = { new MyDate(1, 1), new MyDate(1, 2), new MyDate(1, 3)
                               , new MyDate(1, 4), new MyDate(1, 5), new MyDate(1, 6)
                               , new MyDate(1, 7), new MyDate(1, 8), new MyDate(2, 23)
                               , new MyDate(3, 8), new MyDate(5, 1), new MyDate(5, 9)
                               , new MyDate(6, 12), new MyDate(10, 4) 
                               };

        return new HashSet(Arrays.asList(allWeekends));
    }
}
