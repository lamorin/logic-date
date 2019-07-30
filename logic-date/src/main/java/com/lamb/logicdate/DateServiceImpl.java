package com.lamb.logicdate;

/**
 * DateService
 */
public class DateServiceImpl implements DateService {

    @Override
    public LogicDate getDate() {
        return new LogicDate();
    }

}