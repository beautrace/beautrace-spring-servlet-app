package io.beautrace.spring.servlet.app.api

import io.beautrace.spring.servlet.app.service.MockService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
open class MockApiService(
    private val mockService: MockService,
) {

    @GetMapping(path = ["/mock"])
    open fun doApiWork(
        @RequestParam(required = false) argOne: Int?,
        @RequestParam(required = false) argTwo: String?,
    ): Boolean {
        mockService.doWork()
        return true
    }

    @GetMapping(path = ["/exception"])
    open fun doWorkWithException(
        @RequestParam(required = false) argOne: Int?,
        @RequestParam(required = false) argTwo: String?,
    ): Boolean {
        mockService.doWork()
        throw IllegalStateException("exception!")
    }
}