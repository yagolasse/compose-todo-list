package com.arctouch.composeexample.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.unit.dp
import com.arctouch.composeexample.R

@Composable
fun TodoItemToggleableInput(
    shouldShow: Boolean,
    state: MutableState<String>,
    onActionClick: () -> Unit
) {
    if (shouldShow) {
        val resources = ContextAmbient.current.resources

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
                .padding(start = 16.dp, top = 8.dp, end = 96.dp, 16.dp),
            value = state.value,
            onValueChange = { state.value = it },
            label = { Text(resources.getString(R.string.what_to_do_q)) },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done,
                capitalization = KeyboardCapitalization.Words
            ),
            onImeActionPerformed = { imeAction, keyboardController ->
                keyboardController?.hideSoftwareKeyboard()
                if (imeAction == ImeAction.Done) {
                    onActionClick()
                }
            }
        )
    }
}