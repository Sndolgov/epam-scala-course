package com.epam.home_work.streams.employees;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeJava
{
    private static int  [] yearSalary = {100,100,100,100,100,100,100,100,100,100,100,100};

    public static List<Employee> employees = List.of(
            Employee
                    .builder()
                    .name("Name1")
                    .salary(10000)
                    .yearSalary(yearSalary)
                    .build(),
            Employee
                    .builder()
                    .name("Name2")
                    .salary(20000)
                    .yearSalary(yearSalary)
                    .build(),
            Employee
                    .builder()
                    .name("Name3")
                    .salary(30000)
                    .yearSalary(yearSalary)
                    .build(),
            Employee
                    .builder()
                    .name("Name4")
                    .salary(15000)
                    .yearSalary(yearSalary)
                    .build(),
            Employee
                    .builder()
                    .name("Name5")
                    .salary(25000)
                    .yearSalary(yearSalary)
                    .build()
    );

    public static List<Company> companies = List.of(new Company(employees),new Company(employees),new Company(employees));


    public static void main(String[] args)
    {
        System.out.println("salaryAmount: " + salaryAmount(employees));
        System.out.println("yearSalaryAmount: " + yearSalaryAmount(employees));
        System.out.println("sortBySalary: " + sortBySalary(employees));
        System.out.println("sortByCategory: " + sortByCategory(companies));
    }


    private static int salaryAmount(List<Employee> employees){
        return employees.stream().mapToInt(Employee::getSalary).sum();
    }

    private static int yearSalaryAmount(List<Employee> employees){
        return employees.stream().flatMapToInt(e->Arrays.stream(e.getYearSalary())).sum();
    }

    private static List<String> sortBySalary(List<Employee> employees){
        return employees.stream().sorted((e1,e2)->Integer.compare(e2.getSalary(), e1.getSalary())).map(Employee::getName).collect(Collectors.toList());
    }
    private static Map<EmployeeEnum, List<Employee>> sortByCategory(List<Company> companies){
        return companies.stream().flatMap(c-> c.getEmployees().stream())
                .collect(Collectors.toMap(e-> EmployeeEnum.getCategory(e.getSalary()),e-> new ArrayList<>(Collections.singleton(e)), (o, n)-> {o.addAll(n);return o;}));
    }

    @Data
    @AllArgsConstructor
    static class Company{
        private List<Employee> employees;
    }


}
