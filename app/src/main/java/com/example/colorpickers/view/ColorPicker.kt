package com.example.colorpickers.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.skydoves.colorpicker.compose.*

@Preview
@Composable
fun colorPicker(){
    val controller = rememberColorPickerController()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 30.dp)
            ){
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            AlphaTile(modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .clip(RoundedCornerShape(6.dp)),
                controller = controller
            )
        }
        HsvColorPicker(modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
            .padding(10.dp)
            ,
            controller = controller,
            onColorChanged = {}
        )
        AlphaSlider(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(35.dp)
            ,
            controller =controller,
            tileOddColor = Color.White,
            tileEvenColor = Color.Black
        )
        BrightnessSlider(modifier = Modifier.fillMaxWidth()
            .padding(10.dp)
            .height(35.dp)
            , controller = controller)

    }
}