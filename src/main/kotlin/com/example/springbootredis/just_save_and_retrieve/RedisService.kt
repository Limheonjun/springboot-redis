package com.example.springbootredis.just_save_and_retrieve

import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service
import java.time.Duration


@Service
class RedisService(
    private val redisTemplate: RedisTemplate<String, String>
) {

    // 데이터 넣기
    fun setValues(name: String, age: String) {
        val values = redisTemplate!!.opsForValue()
        values.set(name, age, Duration.ofMinutes(1)) // 1분 뒤 메모리에서 삭제된다.
    }

    // 데이터 가져오기
    fun getValues(name: String?): String? {
        val values = redisTemplate!!.opsForValue()
        return values[name!!]
    }

}