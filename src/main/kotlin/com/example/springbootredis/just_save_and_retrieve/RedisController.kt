package com.example.springbootredis.just_save_and_retrieve

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/redis")
class RedisController(
    private val redisService: RedisService
) {

    @PostMapping("")
    fun saveInRedis(@RequestBody body: HashMap<String, String>) {
        redisService!!.setValues(body["name"]!!, body["age"]!!)
    }

    @GetMapping("")
    fun retrieveFromRedis(@RequestParam name: String?): String? {
        return redisService!!.getValues(name)
    }

}