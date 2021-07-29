package com.erdk.employee.app

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration

open class ShowController : WebMvcConfigurerAdapter() {

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/index").setViewName("index")
        registry.addViewController("/").setViewName("index")
    }

}