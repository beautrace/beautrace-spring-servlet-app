package io.beautrace.aspect

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Aspect
@Component
open class TracingAspect {
    private val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @Pointcut("execution(* io.beautrace..*.*(..))")
    open fun inApp() {
    }

    @Around("inApp()")
    open fun doTracing(pjp: ProceedingJoinPoint): Any {
        log.info("doTracing - before")
        val ret = pjp.proceed()
        log.info("doTracing - after")
        return ret
    }
}