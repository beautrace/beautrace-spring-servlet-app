package io.beautrace.spring.servlet.app.api

import io.beautrace.spring.servlet.app.service.MockService
import io.beautrace.spring.servlet.model.RequestTraceState
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
open class MockApiService(
    private val mockService: MockService,
    private val requestTraceState: RequestTraceState,
) {

    @GetMapping(path = ["/mock"])
    open fun doApiWork(): String {
        mockService.doWork()
        return requestTraceState.methodCalls.toString()
    }
}