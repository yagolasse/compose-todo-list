package com.arctouch.composeexample.component

import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.ui.tooling.preview.Preview
import com.arctouch.composeexample.model.TodoItem
import com.arctouch.composeexample.ui.ComposeExampleTheme

@Preview(
    name = "Todo List Default Preview",
    showBackground = true
)
@Composable
fun TodoListDefaultPreview() {
    ComposeExampleTheme {
        TodoListDisplay(
            dataSet = listOf(
                TodoItem("Item 1"),
                TodoItem("Item 2")
            )
        ) {}
    }
}

@Composable
fun TodoListDisplay(
    modifier: Modifier = Modifier,
    dataSet: List<TodoItem>,
    onItemClick: (TodoItem) -> Unit
) {
    LazyColumnFor(modifier = modifier, items = dataSet) { todoItem ->
        TodoItemDisplay(item = todoItem, onItemClick = onItemClick)
    }
}