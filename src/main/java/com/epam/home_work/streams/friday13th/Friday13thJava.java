package com.epam.home_work.streams.friday13th;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Friday13thJava
{
    public static void main(String[] args)
    {
        System.out.println(countFriday13th(1900, 2000));
    }

    private static LinkedHashMap<Integer, Long> countFriday13th(int startYear, int endYear)
    {
        return LocalDate.of(startYear, 1, 13).datesUntil(LocalDate.of(endYear, 12, 13), Period.ofMonths(1))
                .filter(d -> d.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue((a,b)->Long.compare(b,a)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));
    }
}
