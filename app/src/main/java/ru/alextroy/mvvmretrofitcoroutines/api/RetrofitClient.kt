package ru.alextroy.mvvmretrofitcoroutines.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.alextroy.mvvmretrofitcoroutines.utils.BASE_URL

class RetrofitClient {
    companion object {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(PostsApi::class.java)
    }
}
