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
import com.example.guidin.R
import com.example.guidin.ui.theme.*
//import androidx.compose.foundation.Text
import androidx.wear.tiles.material.Text

import androidx.compose.material.Text as Text


@Composable
fun SearchScreen() {
    var destination by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "GUIDING YOU STEP BY STEP",
            //fontFamily = Poppins,
            color = SecondaryColor,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp
        )
        Image(
            painter = painterResource(id = R.drawable.recherche_it),
            contentDescription = "",
            modifier = Modifier.size(260.dp)
        )
    }



    Card(
        backgroundColor = lilas,
        elevation = 0.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 370.dp)
            .padding(vertical = 20.dp)
            .padding(horizontal = 20.dp)

    ) {

        Column(
            modifier = Modifier.padding(vertical = 20.dp)
        ) {
            Text(
                text = "Enter your destination",
               // fontFamily = Poppins,
                color = SecondaryColor,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 16.sp
            )

            TextField(
                value = destination, onValueChange = { destination = it },
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 50.dp),
                    //.padding(bottom = 200.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = PrimaryColor,
                    backgroundColor = Color.White,
                    cursorColor = PrimaryColor,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = InputBoxShape.medium,
                singleLine = true,
                leadingIcon = {
                    Row(
                        modifier = Modifier.padding(start = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = "",
                            tint = PrimaryColor,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(
                            modifier = Modifier
                                .width(6.dp)
                        )
                        Spacer(
                            modifier = Modifier
                                .width(1.dp)
                                .height(24.dp)
                                .background(PrimaryColor)
                        )
                    }
                },
                placeholder = {
                    Text(text = "Destination", color = Color.Gray)
                },
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    //fontFamily = Poppins
                ) // fin texte
            )
            //fin text field


            //debut bouton GO

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = crevette
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(bottom = 25.dp)
                    .padding(top = 25.dp),
                contentPadding = PaddingValues(vertical = 14.dp),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 2.dp
                ),
                shape = Shapes.medium
            ) {
                Text(
                    text = "GO",
                    // fontFamily = Poppins,
                    color = SecondaryColor,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            } //fin bouton go


            // debut bouton retour accueil



            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = crevette
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                   // .padding(bottom = 25.dp)
                   // .padding(top = 25.dp),
                contentPadding = PaddingValues(vertical = 14.dp),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 2.dp
                ),
                shape = Shapes.medium
            ) {
                Text(
                    text = "Retour",
                    // fontFamily = Poppins,
                    color = SecondaryColor,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            } //fin bouton go


            //fin bouton retour accueil

        } //column
    } //fin card










} // fin function




            /*
            TextField(
                value = destination, onValueChange = { destination = it },
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = PrimaryColor,
                    backgroundColor = Color.White,
                    cursorColor = PrimaryColor,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = InputBoxShape.medium,
                singleLine = true,
                leadingIcon = {
                    Row(
                        modifier = Modifier.padding(start = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = "",
                            tint = PrimaryColor,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(
                            modifier = Modifier
                                .width(6.dp)
                        )
                        Spacer(
                            modifier = Modifier
                                .width(1.dp)
                                .height(24.dp)
                                .background(PrimaryColor)
                        )
                    }
                },
                placeholder = {
                    Text(text = "Destination", color = Color.Gray)
                },
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = Poppins
                )
            )

        }
    }
}


             /*   Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = PrimaryColor
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .padding(top = 20.dp),
                    contentPadding = PaddingValues(vertical = 14.dp),
                    elevation = ButtonDefaults.elevation(
                        defaultElevation = 0.dp,
                        pressedElevation = 2.dp
                    ),
                    shape = Shapes.medium
                ) {
                    Text(
                        text = "GO",
                        fontFamily = Poppins,
                        color = SecondaryColor,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


            }

        }
      /*  TextButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Text(text = "Retour a l'accueil",
                fontFamily = Poppins,
                color= SecondaryColor,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
            )
        } */
    }
} */
*/