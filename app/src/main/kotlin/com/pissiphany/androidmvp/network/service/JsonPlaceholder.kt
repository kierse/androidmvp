package com.pissiphany.androidmvp.network.service

import retrofit2.http.GET
import rx.Observable

/**
 * Created by kierse on 2016-07-10.
 */
interface JsonPlaceholder {
    @GET("posts")
    fun getPosts() : Observable<Object>
}