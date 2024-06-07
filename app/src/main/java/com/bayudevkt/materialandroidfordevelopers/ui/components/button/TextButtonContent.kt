package com.bayudevkt.materialandroidfordevelopers.ui.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Save
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bayudevkt.materialandroidfordevelopers.ui.theme.MaterialAndroidForDevelopersTheme

/* region */
@Composable
fun TextButtonContent(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Button")
        }
        TextButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Button")
        }
        TextButton(
            onClick = { /*TODO*/ },
            enabled = false,
        ) {
            Text(text = "Button Disabled")
        }
        TextButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Rounded.Save, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Button with Icon")
        }
    }
}
/* endregion */

@Preview(showBackground = true)
@Composable
fun PreviewTextButtonContent() {
    MaterialAndroidForDevelopersTheme {
        TextButtonContent()
    }
}