package com.pissiphany.repository.api

import org.junit.Test
import retrofit2.Retrofit

/**
 * Created by kierse on 2016-07-17.
 */
class JsonPlaceHolderServicetest {
    @Test
    fun constructService() {
        Retrofit.Builder()
                .baseUrl("http://example.com")
                .build()
                .create(JsonPlaceholderService::class.java)
    }

    @Test
    fun test() {
        val service = Retrofit.Builder()
                .baseUrl("http://example.com")
                .build()
                .create(JsonPlaceholderService::class.java)

//        service.posts()
    }
}