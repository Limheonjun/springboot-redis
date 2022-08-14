package com.example.springbootredis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@SpringBootApplication
@EnableCaching
@EnableRedisRepositories
class SpringbootRedisApplication

fun main(args: Array<String>) {
	runApplication<SpringbootRedisApplication>(*args)
}
