package com.practice.assignment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .padding(7.dp)
    ) {

        Row {

            Text(
                text = "Design Layouts",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(2.dp))

        Row() {
            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = "CLIENT  ",
                    fontSize = 13.5.sp,
                    color = Color.Black
                )
                Text(
                    text = "BridgeStone",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
            }


            Row(modifier = Modifier.weight(1f)) {
                Text(
                    text = "    JOB ID   ",
                    fontSize = 13.5.sp,
                    color = Color.Black
                )
                Text(
                    text = "BRID1337",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
            }
        }


    }

}
