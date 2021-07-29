package com.erdk.employee.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
class ErdkEmployeeApplication

fun main(args: Array<String>) {
    SpringApplication.run(ErdkEmployeeApplication::class.java, *args)
}