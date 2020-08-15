package com.schedule.kotlin.jobs

import io.quarkus.scheduler.Scheduled
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class Schedule {

    @Scheduled(every = "10s")
    fun printMsgEvery10s() {
        println("OK")
    }
}