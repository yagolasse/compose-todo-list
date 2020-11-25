package com.arctouch.composeexample

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Preview(name = "Default Preview")
@Composable
fun ItemPreview() {
    Item(content = "Test", onClick = {})
}

@Composable
fun Item(content: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Text(modifier = Modifier.padding(8.dp), text = content)
    }
}