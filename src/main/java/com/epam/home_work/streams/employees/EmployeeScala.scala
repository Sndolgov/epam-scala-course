package com.epam.home_work.streams.employees

import com.epam.home_work.streams.employees.EmployeeJava.Company

import scala.collection.JavaConversions._

object EmployeeScala {


  def main(args: Array[String]): Unit = {
    val employees = EmployeeJava.employees.toList
    val companies = EmployeeJava.companies.toList

    println("salaryAmount: " + salaryAmount(employees))
    println("yearSalaryAmount: " + yearSalaryAmount(employees))
    println("sortBySalary: " + sortBySalary(employees))
    println("sortByCategory: " + sortByCategory(companies))
  }

  def salaryAmount(employees: List[Employee]):Int = {
    employees.map(_.getSalary).sum
  }

  def yearSalaryAmount(employees: List[Employee]):Int = {
    employees.map(_.getYearSalary.sum).sum
  }

  def sortBySalary(employees: List[Employee]):List[String] = {
    employees.sortBy(-_.getSalary).map(_.getName)
  }

  def sortByCategory(companies: List[Company]):Map[EmployeeEnum, List[Employee]] = {
    companies.flatMap(_.getEmployees).groupBy(e=> EmployeeEnum.getCategory(e.getSalary))
  }
}
