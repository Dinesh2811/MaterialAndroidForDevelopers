package com.bayudevkt.materialandroidfordevelopers.ui.components.tab

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Explore
import androidx.compose.material.icons.rounded.Games
import androidx.compose.material.icons.rounded.Image
import androidx.compose.material.icons.rounded.LibraryMusic
import androidx.compose.material.icons.rounded.Movie
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PrimaryScrollableTabRow
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.SecondaryScrollableTabRow
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.bayudevkt.materialandroidfordevelopers.ui.theme.MaterialAndroidForDevelopersTheme
import kotlin.math.roundToInt

/* region */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScrollableTabRowContent(
    modifier: Modifier = Modifier,
) {
    val tabs = remember {
        listOf(
            "Trending" to Icons.Rounded.Explore,
            "Music" to Icons.Rounded.LibraryMusic,
            "Game" to Icons.Rounded.Games,
            "Movie" to Icons.Rounded.Movie,
            "Search" to Icons.Rounded.Search,
            "Gallery" to Icons.Rounded.Image
        )
    }
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Column(
        modifier = modifier,
    ) {
        Text(text = "TabRow")
        ScrollableTabRow(
            edgePadding = 0.dp,
            selectedTabIndex = selectedTabIndex,
            tabs = {
                tabs.forEachIndexed { index, tab ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = {
                            selectedTabIndex = index
                        },
                        text = { Text(text = tab.first) }
                    )
                }
            },
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "SecondaryTabRow")
        SecondaryScrollableTabRow(
            edgePadding = 0.dp,
            selectedTabIndex = selectedTabIndex,
            tabs = {
                tabs.forEachIndexed { index, tab ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = {
                            selectedTabIndex = index
                        },
                        text = { Text(text = tab.first) }
                    )
                }
            },
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "PrimaryTabRow")
        PrimaryScrollableTabRow(
            edgePadding = 0.dp,
            selectedTabIndex = selectedTabIndex,
            tabs = {
                tabs.forEachIndexed { index, tab ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = {
                            selectedTabIndex = index
                        },
                        text = { Text(text = tab.first) }
                    )
                }
            },
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "TabRow with Icon")
        ScrollableTabRow(
            edgePadding = 0.dp,
            selectedTabIndex = selectedTabIndex,
            tabs = {
                tabs.forEachIndexed { index, tab ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = {
                            selectedTabIndex = index
                        },
                        text = { Text(text = tab.first) },
                        icon = {
                            Icon(
                                imageVector = tab.second,
                                contentDescription = null
                            )
                        }
                    )
                }
            },
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "TabRow with Custom Indicator")
        ScrollableTabRow(
            edgePadding = 0.dp,
            selectedTabIndex = selectedTabIndex,
            tabs = {
                tabs.forEachIndexed { index, tab ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = {
                            selectedTabIndex = index
                        },
                        text = { Text(text = tab.first) },
                    )
                }
            },
            indicator = { positions ->
                if (selectedTabIndex < positions.size) {
                    Box(
                        Modifier
                            .tabIndicatorOffset(positions[selectedTabIndex])
                            .padding(4.dp)
                            .fillMaxSize()
                            .border(width = 2.dp, color = MaterialTheme.colorScheme.primary, shape = CircleShape)
                    )
                }
            }
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text(text = tabs[selectedTabIndex].first)
        }
    }
}
/* endregion */

@Preview(showBackground = true)
@Composable
fun PreviewScrollableTabRowContent() {
    MaterialAndroidForDevelopersTheme {
        ScrollableTabRowContent()
    }
}