package com.practice.assignment

import android.os.Build
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun Item(item: DesignFile) {
    Box(modifier = Modifier.padding(5.dp)) {


        Column(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(8.dp)
                )
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            Row(
                modifier = Modifier
                    .padding(7.dp, 5.dp)
                    .fillMaxWidth(),
//                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Row() {
                    Icon(
                        painter = painterResource(id = R.drawable.pdf_icon),
                        contentDescription = "Icon",
                        tint = Color(0xFFd26053),
                        modifier = Modifier.size(34.dp)
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(modifier = Modifier.fillMaxWidth(0.8f)) {
                    Text(
                        text = item.name,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp,
                        color = Color.Black,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(end = 15.dp)
                    )

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .background(
                                    color = Color(0xFFFFE3E4),
                                    shape = RoundedCornerShape(2.dp)
                                )
                                .padding(3.dp, 1.25.dp)
                        ) {
                            Text(
                                text = "V${item.version}", color = Color(0xFFEC2227),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Monospace,
                            )
                        }
                        Spacer(modifier = Modifier.width(7.dp))

                        Row {
                            Text(
                                text = "Uploaded on: " + formatTime(item.uploadedAt),
                                fontSize = 11.sp,
                                color = Color.DarkGray
                            )
                        }
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.load_icon),
                        contentDescription = "Loader",
                        tint = Color(0xFFd26053),
                        modifier = Modifier.size(20.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "Loader",
                        modifier = Modifier
                            .size(20.dp)
                            .rotate(90f),
                        tint = Color.Black
                    )
                }
            }
        }
    }

}

fun formatTime(originalTime: String): String {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSX", Locale.getDefault())
    val outputFormat = SimpleDateFormat("dd MMM, yy \thh:mm a", Locale.getDefault())

    val date = inputFormat.parse(originalTime)
    return outputFormat.format(date!!)
}
