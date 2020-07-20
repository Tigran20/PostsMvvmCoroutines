package ru.alextroy.mvvmretrofitcoroutines.repository

import ru.alextroy.mvvmretrofitcoroutines.api.PostsApi
import ru.alextroy.mvvmretrofitcoroutines.api.RetrofitClient

class PostsRepository {
    private var client: PostsApi = RetrofitClient.retrofit
    suspend fun getPosts() = client.getPosts()
}