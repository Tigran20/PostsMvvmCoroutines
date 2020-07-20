package ru.alextroy.mvvmretrofitcoroutines.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.post_list.*
import ru.alextroy.mvvmretrofitcoroutines.R
import ru.alextroy.mvvmretrofitcoroutines.model.Posts
import ru.alextroy.mvvmretrofitcoroutines.viewmodel.PostsViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: PostsViewModel by viewModels()
    private lateinit var adapter: PostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_list)

        initAdapter()
        showData()
    }

    private fun initAdapter() {
        adapter = PostsAdapter()
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
    }

    private fun showData() {
        viewModel.firstTodo.observe(this, Observer {
            adapter.setPosts(it)
        })
    }
}