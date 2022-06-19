package com.beautrace.spring.servlet.app.service

import org.springframework.stereotype.Service

@Service
open class MockService {

    open fun doWork() = "work"
}