package com.practice.assignment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DisplayContent(it: PaddingValues) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .background(color = Color(0xFFF9F9F9))
    ) {

//        Spacer(modifier = Modifier.fillMaxWidth().background(Color.LightGray).height(2.dp))
        SectionsList()
    }
}