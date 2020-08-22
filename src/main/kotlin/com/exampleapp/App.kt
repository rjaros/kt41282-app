package com.exampleapp

import com.test.Test
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.Serializable

@Serializable
data class Testing(val content: String)

class Test2 : Test() {
    suspend fun des(string: String): Testing = deserialize(string)
}

fun main() {
    GlobalScope.launch {
        val testing = Test2().des("{\"content\": \"test\"}")
        console.log(testing)
    }
}
