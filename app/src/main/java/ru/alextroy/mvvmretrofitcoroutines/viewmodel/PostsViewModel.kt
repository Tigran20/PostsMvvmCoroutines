package ru.alextroy.mvvmretrofitcoroutines.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import ru.alextroy.mvvmretrofitcoroutines.model.Posts
import ru.alextroy.mvvmretrofitcoroutines.repository.PostsRepository

class PostsViewModel : ViewModel() {
    private val repository: PostsRepository = PostsRepository()

    val firstTodo: LiveData<Posts> = liveData(Dispatchers.IO) {
        val postsData = repository.getPosts()
        emit(postsData)
    }
}