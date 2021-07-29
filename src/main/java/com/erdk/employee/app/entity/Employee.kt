package com.erdk.employee.app.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Employee(
    @Id
    var id: Long = 0,
    var name: String = "",
    var age: Int = 0,
    var dept: String = ""
)