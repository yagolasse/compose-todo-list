package com.arctouch.composeexample.component

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.arctouch.composeexample.ui.ComposeExampleTheme

@Preview(
    name = "Add Button",
    showBackground = true
)
@Composable
fun AddTodoListFloatingActionButtonPreview() {
    TodoListFloatingActionButtonPreview(isActionAddItem = true)
}

@Preview(
    name = "Confirm Button",
    showBackground = true
)
@Composable
fun ConfirmTodoListFloatingActionButtonPreview() {
    TodoListFloatingActionButtonPreview(isActionAddItem = false)
}

@Composable
fun TodoListFloatingActionButtonPreview(isActionAddItem: Boolean) {
    ComposeExampleTheme {
        TodoListFloatingActionButton(onClick = {}, isActionAddItem = isActionAddItem)
    }
}

@Composable
fun TodoListFloatingActionButton(onClick: () -> Unit, isActionAddItem: Boolean) {
    FloatingActionButton(onClick = onClick) {
        val currentIcon = if (isActionAddItem) Icons.Filled.Add else Icons.Filled.Check
        Icon(asset = currentIcon)
    }
}