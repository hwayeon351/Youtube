package com.example.youtube.service

import com.example.youtube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/1d022ac7-2cfa-4306-80f2-8f31419d8d20")
    fun listVideos(): Call<VideoDto>
}