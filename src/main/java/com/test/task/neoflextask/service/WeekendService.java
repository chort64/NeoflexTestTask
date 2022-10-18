package com.test.task.neoflextask.service;

import java.util.Arrays;
import java.util.HashSet;

import com.test.task.neoflextask.model.OwnDate;

public class WeekendService {
    
    static public HashSet<OwnDate> getAllWeekends() {
        OwnDate allWeekends[] = { new OwnDate(1, 1), new OwnDate(1, 2), new OwnDate(1, 3)
                                , new OwnDate(1, 4), new OwnDate(1, 5), new OwnDate(1, 6)
                                , new OwnDate(1, 7), new OwnDate(1, 8), new OwnDate(2, 23)
                                , new OwnDate(3, 8), new OwnDate(5, 1), new OwnDate(5, 9)
                                , new OwnDate(6, 12), new OwnDate(10, 4) 
                                };

        return new HashSet(Arrays.asList(allWeekends));
    }
}
