package com.arctouch.composeexample.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.arctouch.composeexample.model.TodoItem
import com.arctouch.composeexample.ui.ComposeExampleTheme

@Preview(
    name = "Default Preview",
    showBackground = true
)
@Composable
fun ItemDefaultPreview() {
    ComposeExampleTheme {
        TodoItemDisplay(TodoItem("This is a TODO item")) {}
    }
}

@Composable
fun TodoItemDisplay(item: TodoItem, onItemClick: (TodoItem) -> Unit) {
    TodoItemContainer(item = item, onItemClick = onItemClick) {
        Text(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            text = item.content
        )
    }
}

@Composable
fun TodoItemContainer(
    item: TodoItem,
    onItemClick: (TodoItem) -> Unit,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = { onItemClick(item) }),
        content = content
    )
}