package io.beautrace.api

import io.beautrace.service.MockService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
open class MockApiService(
    private val mockService: MockService,
) {

    @GetMapping(path = ["/mock"])
    open fun doApiWork(): String {
        return mockService.doWork()
    }
}