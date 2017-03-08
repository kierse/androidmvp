package com.pissiphany.repository.model

import org.junit.Test

/**
 * Created by kierse on 2016-07-17.
 */
class PostTest {
    @Test
    fun creation() {
        Post.builder()
                .id(1L)
                .userId(2L)
                .title("title")
                .body("body")
                .build()

    }
}