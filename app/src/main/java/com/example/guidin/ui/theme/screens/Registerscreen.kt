

/***
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
fun Registerscreen() {
    BackgroundImageRegister()
    RegisterArea()
}



@Composable
fun RegisterArea() {

    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var nom_prenom by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var code_post by remember { mutableStateOf("") }
    val genderOptions = listOf("Male", "Female", "Other")
    var gender by remember { mutableStateOf(genderOptions[0]) }

    var handicape by remember { mutableStateOf(true) }
    var conditions by remember { mutableStateOf(true) }
    var pub by remember { mutableStateOf(true) }

    var isPasswordOpen by remember { mutableStateOf(false) }








    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 220.dp)
    ) {
        //////////////////// debut image /////////////////////
        /*  Image(painter = painterResource(id = R.drawable.register_image),
            contentDescription = "",
            //modifier = Modifier.size(160.dp)
            //modifier = Modifier.fillMaxSize()
        ) */
        //////////////////// fin image /////////////////////

//////////////////// debut texte /////////////////////

        /*   Text( text = "CREATE YOUR ACCOUNT",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            //fontFamily = Reemkufi
                        //fontFamily = poppins,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 180.dp)

        ) **/
        //////////////////////// formulaire debut ///////////////////////////////

//////////////////////// Username debut ///////////////////////////////

        TextField(
            value = username, onValueChange = { username = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(bottom = 5.dp)
                .padding(top = 0.dp),


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
                //////////////////////// Icone debut ///////////////////////////////
                Row(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_user), contentDescription = "",
                        tint = PrimaryColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Spacer(
                        modifier = Modifier
                            .width(1.dp)
                            .height(24.dp)
                        //.background(BackgroundColor)
                    )

                }
//////////////////////// Icone fin ///////////////////////////////

            },
            placeholder = {
                Text(
                    text = "Full Name",
                    color = PlaceholderColor
                )
            },

            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = poppins
            )

        )
//////////////////////// Username fin ///////////////////////////////


/////////////////////// email debut ///////////////////////////////

        TextField(
            value = email, onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 10.dp),


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
                //////////////////////// Icone debut ///////////////////////////////
                Row(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_email),
                        contentDescription = "",
                        tint = PrimaryColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Spacer(
                        modifier = Modifier
                            .width(1.dp)
                            .height(24.dp)
                        //.background(BackgroundColor)
                    )

                }
//////////////////////// Icone  fin ///////////////////////////////

            },
            placeholder = {
                Text(
                    text = "Email Address",
                    color = PlaceholderColor
                )
            },

            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = poppins
            )

        )
//////////////////////// fin email ////////////////////////////////////


/////////////////////// password debut ///////////////////////////////

        TextField(value = password, onValueChange = { password = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 10.dp),


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
                //////////////////////// Icone password debut ///////////////////////////////
                Row(
                    modifier = Modifier.padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_lock), contentDescription = "",
                        tint = PrimaryColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Spacer(
                        modifier = Modifier
                            .width(1.dp)
                            .height(24.dp)
                        //.background(BackgroundColor)
                    )

                }
//////////////////////// Icone password fin ///////////////////////////////

            },
            placeholder = {
                Text(
                    text = "*********",
                    color = PlaceholderColor
                )
            },
            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = poppins
            ),
            visualTransformation = if (!isPasswordOpen) {
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None
            },
            trailingIcon = {
                IconButton(onClick = { isPasswordOpen = !isPasswordOpen }) {
                    if (!isPasswordOpen) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_eye_open),
                            contentDescription = "",
                            tint = PrimaryColor,
                            modifier = Modifier.size(24.dp)
                        )
                    } else {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_eye_close),
                            contentDescription = "",
                            tint = PrimaryColor,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                }


            }
        )
//////////////////////// fin password //////////////////////////
// ///////////////////// age debut ///////////////////////////////
        Row(
            //modifier = Modifier.width(7.dp),

            horizontalArrangement = Arrangement.SpaceBetween
        ) {


            TextField(
                value = age, onValueChange = { age = it },
                modifier = Modifier

                    .width(200.dp)

                    .padding(horizontal = 20.dp)
                    .padding(top = 10.dp),

                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = PrimaryColor,
                    backgroundColor = Color.White,
                    cursorColor = PrimaryColor,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),

                shape = InputBoxShapeSmall.small,
                singleLine = true,
                //////////////////////// Icone debut ///////////////////////////////
                leadingIcon = {

                    Row(
                        modifier = Modifier.padding(start = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,

                        ) {
                        Icon(
                            painter = painterResource(id = R.drawable.accessibility_new),
                            contentDescription = "",
                            tint = PrimaryColor,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Spacer(
                            modifier = Modifier
                                .width(1.dp)
                                .height(24.dp)
                            //.background(BackgroundColor)
                        )

                    }

                },
                //////////////////////// Icone fin ///////////////////////////////

                placeholder = {
                    Text(
                        text = "Age",
                        color = PlaceholderColor
                    )
                },

                textStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    //fontFamily = poppins
                )

            )
            /////////////////////// age fin /////////////////////////////////:
//////////////////////////////// gender debut ///////////////////////////
            DropdownMenu(
                expanded = false, onDismissRequest = {},
               // modifier = Modifier.fillMaxWidth()
                    //.background(Color.White)
                //properties = ExposedDropdownMenuDefaults


            ) {
                genderOptions.forEach { option ->
                    DropdownMenuItem(onClick = {
                        gender = option
                    }) {
                        Text(option)
                    }
                }
            }


            OutlinedTextField(
                value = gender,
                onValueChange = {},
                label = { Text("Gender") },
                modifier = Modifier
                    // .fillMaxWidth()
                    .background(Color.White)
                    //.width(200.dp)
                    .padding(top = 10.dp),


                )

            /////////////////
        }
///////////////// fin age ////////////////////////////

        // ///////////////////// code postale debut ///////////////////////////////


        Row(
            //modifier = Modifier.fillMaxWidth(),
            //horizontalArrangement = Arrangement.SpaceBetween
        ) {


            TextField(
                value = code_post, onValueChange = { code_post = it },
                modifier = Modifier

                    // .fillMaxWidth()

                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 10.dp),

                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = PrimaryColor,
                    backgroundColor = Color.White,
                    cursorColor = PrimaryColor,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),

                shape = InputBoxShape.medium,
                singleLine = true,
                //////////////////////// Icone debut ///////////////////////////////
                leadingIcon = {

                    Row(
                        modifier = Modifier.padding(start = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,

                        ) {
                        Icon(
                            painter = painterResource(id = R.drawable.home_pin),
                            contentDescription = "",
                            tint = PrimaryColor,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Spacer(
                            modifier = Modifier
                                .width(1.dp)
                                .height(24.dp)
                            //.background(BackgroundColor)
                        )

                    }

                },
                //////////////////////// Icone fin ///////////////////////////////

                placeholder = {
                    Text(
                        text = "postal code/ zip code",
                        color = PlaceholderColor
                    )
                },

                textStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    //fontFamily = poppins
                )

            )
        }

//////////////////////////// code postale fin//////////////////////////////

//////////////////////////// handicape debut ///////////////////////////////////

        Row( modifier = Modifier
            //.padding(top = .dp)
            .padding(horizontal = 40.dp)
            .fillMaxWidth(),
            verticalAlignment =  Alignment.CenterVertically
        ) {
            Checkbox(checked = handicape , onCheckedChange = { handicape = it },

                colors = CheckboxDefaults.colors(
                    checkedColor = PrimaryColor,
                    uncheckedColor = Color.White,
                    checkmarkColor = Color.White

                ),

                modifier = Modifier.clip(shape = Shapes.medium)
                   // .padding(top = 20.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))


            Text (text = "Handicape Situation",
            style = MaterialTheme.run {
                typography.body1.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        color = Color.White // Optional, change as needed
                    )
            }
            )

        }

//////////////////////////// handicape fin  ///////////////////////////////////
/////////////////////////// conditions d'inscription  debut ///////////////////////////////////

        Row( modifier = Modifier
            //.padding(top = 5.dp)
            .padding(horizontal = 30.dp)
            .fillMaxWidth(),
           // verticalAlignment =  Alignment.CenterVertically
        ) {
            Checkbox(checked = conditions , onCheckedChange = { conditions = it },

                colors = CheckboxDefaults.colors(
                    checkedColor = PrimaryColor,
                    uncheckedColor = Color.White,
                    checkmarkColor = Color.White

                ),

                modifier = Modifier.clip(shape = Shapes.medium)
                // .padding(top = 20.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))


            Text (text = "I accept the terms and conditions and the privacy policy.",
                style = MaterialTheme.run {
                    typography.body1.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White // Optional, change as needed
                    )
                }
            )

        }

//////////////////////////// conditions  fin  ///////////////////////////////////

//////////////////////// bouton register //////////////////////////
        Button(onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),

            contentPadding = PaddingValues(vertical = 12.dp),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp
            )

        ) {
            Text(text = "Register",
            color = Color.White,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold)
        }
/////////////////////// already have account debut ///////////////////////////

        TextButton(onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),


            ) {
            Text(text = "Already have an account ? Sing IN ",
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold)

        }



/////////////////////// already have account fin ///////////////////////////


///////////// ////////////////// fin formulaire   /////////////////////

        }
    }


@Composable
fun BackgroundImageRegister() {
    Box (
        contentAlignment = Alignment.TopCenter
    ){

        Image(modifier = Modifier.fillMaxSize()
            ,painter = painterResource(id = R.drawable.register),
            contentDescription = "background_image",
            contentScale = ContentScale.FillBounds
        )

    }
    }
**/