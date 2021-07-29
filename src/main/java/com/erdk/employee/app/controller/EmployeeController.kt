package com.erdk.employee.app.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping
import com.erdk.employee.app.entity.Employee
import com.erdk.employee.app.repository.EmployeeRepository

@RestController
@RequestMapping("/employee")
class EmployeeController(val emplRepo: EmployeeRepository) {

    @PostMapping
    fun saveEmployee(@RequestBody employee: Employee): Employee {
        return emplRepo.save(employee)
    }

    @GetMapping("/{id}")
    fun getEmployee(@PathVariable id: Long): Employee {
        return emplRepo.findOne(id)
    }

    @GetMapping
    fun getAllEmployees(): Iterable<Employee> {
        return emplRepo.findAll()
    }

    @PutMapping
    fun updateEmployee(@RequestBody employee: Employee) {
        emplRepo.save(employee)
    }

    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id: Long) {
        emplRepo.delete(id)
    }


}