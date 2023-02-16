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

import androidx.compose.material.Text as Text

@Composable
fun SettingScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = BackgroundColorSetting)
    )
        {
        //BackgroundSetting()
        HeaderText()
        ProfilCardUI()
        GeneralOptionUI()
    }

}

@Composable
fun GeneralOptionUI() {
    Column() {
        Text (text = "Check Your Profile",
            //color = Color.Black,
            //textAlign = TextAlign.Center,

            //fontWeight = FontWeight.Bold,
            //fontSize = 16.sp
        )
    }
}

@Composable
fun ProfilCardUI() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(150.dp)
            .padding(10.dp),
    backgroundColor = Color.White,
        elevation = 0.dp,
        shape = Shapes.large
    ) {

        Row(
            modifier = Modifier.padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Text (text = "Check Your Profile",
                    color = Color.Black,
                    textAlign = TextAlign.Center,

                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                
                Button(onClick = {},
                    modifier = Modifier
                       .padding( 10.dp),
                    contentPadding = PaddingValues(horizontal = 30.dp)
                , elevation = ButtonDefaults.elevation(
                        defaultElevation = 0.dp,
                        pressedElevation = 2.dp
                ),
                    shape = Shapes.medium
                    )


                {
                    Text (text = "View",
                        color = Color.Black,
                        textAlign = TextAlign.Center,

                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
                
            }
            Image(painter = painterResource(id = R.drawable.ic_profile_card),
                contentDescription = "profilecard",
            modifier = Modifier.heightIn(100.dp)
                )



        }


    }
}


@Composable
fun HeaderText() {
    Text (text = "Settings",
    color = Color.Black,
    textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, bottom = 10.dp),
        fontWeight = FontWeight.ExtraBold,
        fontSize = 16.sp
        )
}
