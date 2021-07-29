package com.erdk.employee.app.repository

import org.springframework.data.repository.CrudRepository
import com.erdk.employee.app.entity.Employee

interface EmployeeRepository : CrudRepository<Employee, Long> {

}