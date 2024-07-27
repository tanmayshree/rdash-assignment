package com.practice.assignment

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SectionsList() {
    val data = Data()
    val distinctSections = data.distinctSections()

    LazyColumn(modifier = Modifier.padding(10.dp)) {

        itemsIndexed(distinctSections) { index, section ->
            val isCollapsible = remember {
                mutableStateOf(index <= 1)
            }
            val sectionData = data.getData(section)
            Section(section, sectionData, isCollapsible)
        }
    }
}

@Composable
fun Section(section: String, sectionData: List<DesignFile>, isCollapsible: MutableState<Boolean>) {
    Column(modifier = Modifier
        .animateContentSize(
            animationSpec = tween(durationMillis = 500)
        )
    ) {
        SectionHeading(section, sectionData.size, isCollapsible)
        if (isCollapsible.value) {
            sectionData.forEach { item ->
                Item(item)
            }
        }
    }
}