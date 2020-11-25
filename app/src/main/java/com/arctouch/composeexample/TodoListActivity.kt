package com.arctouch.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import androidx.lifecycle.ViewModelProvider
import com.arctouch.composeexample.component.TodoListScreen
import com.arctouch.composeexample.viewmodel.TodoListViewModel

class TodoListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProvider(this).get(TodoListViewModel::class.java)

        setContent {
            TodoListScreen(
                stateLiveData = viewModel.state,
                onActionClick = viewModel::onActionClick,
                onItemClick = viewModel::removeTodoItem
            )
        }
    }
}