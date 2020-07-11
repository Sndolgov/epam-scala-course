package com.epam.home_work.streams.employees;

import java.util.Arrays;

public enum EmployeeEnum
{
    JUNIOR(0, 14000),
    MIDDLE(14000, 21000),
    SENIOR(21000, Integer.MAX_VALUE);

    private int from;
    private int to;

    EmployeeEnum(int from, int to)
    {
        this.from = from;
        this.to = to;
    }

    public static EmployeeEnum getCategory(int salary)
    {
        return Arrays.stream(EmployeeEnum.values()).filter(e -> salary >= e.from && salary < e.to).findAny().orElseThrow(() -> new RuntimeException("Wrong salary value: " + salary));
    }
}
