package com.pissiphany.repository.api

import com.pissiphany.repository.model.Post
import retrofit2.http.GET
import retrofit2.http.POST
import rx.Observable

/**
 * Created by kierse on 2016-07-17.
 */
interface JsonPlaceholderService {
    @GET("posts")
    fun posts() : Observable<Post>

    @POST("posts")
    fun post(post : Post)
}