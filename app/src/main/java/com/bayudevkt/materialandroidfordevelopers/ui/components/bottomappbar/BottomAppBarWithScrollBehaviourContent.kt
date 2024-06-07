package com.bayudevkt.materialandroidfordevelopers.ui.components.bottomappbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bayudevkt.materialandroidfordevelopers.ui.theme.MaterialAndroidForDevelopersTheme

/* region */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomAppBarWithScrollBehaviourContent(
    modifier: Modifier = Modifier,
) {
    val scrollBehavior = BottomAppBarDefaults.exitAlwaysScrollBehavior()
    Column(
        modifier = modifier,
    ) {
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .nestedScroll(scrollBehavior.nestedScrollConnection)
                .weight(1f),
        ) {
            item {
                CenterAlignedTopAppBar(title = {
                    Text(text = "Scroll me")
                })
            }
            items(100) { index ->
                Surface(
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier.fillMaxWidth(),
                    shadowElevation = 2.dp,
                    tonalElevation = 2.dp,
                ) {
                    Text(text = "Item $index", modifier = Modifier.padding(16.dp))
                }
            }
        }
        BottomAppBar(
            scrollBehavior = scrollBehavior,
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Explore, contentDescription = "Explore")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
                }
            },
            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
                }
            },
        )
    }
}
/* endregion */

@Preview(showBackground = true)
@Composable
fun PreviewBottomAppBarWithScrollBehaviourContent() {
    MaterialAndroidForDevelopersTheme {
        BottomAppBarWithScrollBehaviourContent()
    }
}