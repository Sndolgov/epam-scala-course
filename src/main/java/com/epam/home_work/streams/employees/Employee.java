package com.epam.home_work.streams.employees;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@ToString(exclude = "yearSalary")
public class Employee implements Serializable
{
    private String name;
    private int salary;
    private int[] yearSalary;
}
