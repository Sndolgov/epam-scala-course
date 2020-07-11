package com.epam.home_work.streams.employees;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString(exclude = "yearSalary")
public class Employee
{
    private String name;
    private int salary;
    private int[] yearSalary;
}
