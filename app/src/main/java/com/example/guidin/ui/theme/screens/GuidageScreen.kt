package com.example.guidin.ui.theme.screens


import android.graphics.drawable.Icon
import android.widget.CheckBox
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
//import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Black
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.tiles.ModifiersBuilders.Background
import com.example.guidin.R
import com.example.guidin.ui.theme.*
//import androidx.compose.foundation.Text
import androidx.wear.tiles.material.Text



@Composable
fun GuidageScreen(){

    var destination by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text (text = "Guiding you every step of the way",
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
            //fontFamily = Poppins
            textAlign = TextAlign.Center,
            //modifier = Modifier.width(150.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp)
        )
        
        Image(painter = painterResource(id = R.drawable.register_image),
            contentDescription = "",
        modifier = Modifier.size(240.dp))

        Card(
            backgroundColor = Color.White,
        elevation = 0.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)) {

          Column(
              modifier = Modifier.padding(vertical = 20.dp)

            ) {


              Text(
                  text = "Enter your destination bellow",
                  color = Color.Black,
                  fontSize = 12.sp,
                  fontWeight = FontWeight.ExtraBold,
                  //fontFamily = Poppins
                  textAlign = TextAlign.Center,
                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(top = 10.dp)
              )

                TextField(value = destination, onValueChange = {destination = it})
              

          }

        }
        
        
    }



}