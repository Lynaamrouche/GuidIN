package com.example.guidin.ui.theme.screens


import android.graphics.drawable.Icon
import android.widget.CheckBox
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
fun Register() {
    //var destination by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxWidth(),

    ) {
        RegisterArea()
    }
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
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "JOIN THE JOURNEY, Sign up and start exploring indoors with GuidIN",
            //fontFamily = Poppins,
            color = SecondaryColor,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp
        )
        Image(
            painter = painterResource(id = R.drawable.acceuil),
            contentDescription = "",
            modifier = Modifier.size(200.dp)
        )
    }

    Card(
        backgroundColor = lilas,
        elevation = 0.dp,
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)

            .padding(top = 20.dp, bottom = 10.dp, start = 20.dp, end = 20.dp)

    ) {

        Column(
            modifier = Modifier.padding(vertical = 20.dp)
        ) {

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
                            painter = painterResource(id = R.drawable.ic_user),
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
                            painter = painterResource(id = R.drawable.ic_lock),
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
            Row(verticalAlignment = Alignment.CenterVertically) {

                Box(
                    modifier = Modifier
                        .padding(start = 0.dp)
                ) {

                    Column(
                        // column de age
                    ) {

                        TextField(
                            value = age,
                            onValueChange = { age = it },
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
                                    )
                                }
                            },
                            placeholder = {
                                Text(
                                    text = "Age",
                                    color = PlaceholderColor
                                )
                            },
                            textStyle = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                            )
                        )
                    }
                }

                TextField(
                    value = gender,
                    onValueChange = { gender = it },
                    modifier = Modifier
                        .width(200.dp)
                        .padding(horizontal = 20.dp)
                        .padding(top = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = PrimaryColor,
                        backgroundColor = Color.White,
                        cursorColor = PrimaryColor,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    shape = InputBoxShapeSmall.small,
                    singleLine = true,
                    leadingIcon = {
                        Row(
                            modifier = Modifier.padding(start = 8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = "",
                                tint = PrimaryColor,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Spacer(
                                modifier = Modifier
                                    .width(1.dp)
                                    .height(24.dp)
                            )
                        }
                    },
                    placeholder = {
                        Text(
                            text = "Gender",
                            color = PlaceholderColor
                        )
                    },
                    textStyle = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                )
            }

        }//fin column


        //////////////// fin age ////////////////////////////////


//////////////// debut code postal /////////////////////////////


        Box(
            modifier = Modifier

                .padding(top = 280.dp, start = 0.dp)
        ) {

            Column( //column de code post
                // modifier = Modifier


                //   .padding(top = 10.dp, bottom = 10.dp, start = 30.dp, end = 20.dp)

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
        }

//////////////// fin code postal /////////////////////////////


/////////////////// debut handicape ////////////////////////


        /**      Box(
            modifier = Modifier

                .padding(top = 350.dp, start = 25.dp)
        ) {


            Checkbox(
                checked = handicape, onCheckedChange = { handicape = it },

                colors = CheckboxDefaults.colors(
                    checkedColor = PrimaryColor,
                    uncheckedColor = Color.White,
                    checkmarkColor = Color.White

                ),

                modifier = Modifier.clip(shape = Shapes.medium)
                    .padding(top = 50.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))


            Text(text = "Handicape Situation",
                style = MaterialTheme.run {
                    typography.body1.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White // Optional, change as needed
                    )
                }
            )



        } //fin column **/


//////////////// fin code postal  /////////////////////////////

////////////////////////// boutton enregistrer /////////////////////


//////////////////////////////////

        /**     Row(
        modifier = Modifier

        .padding(start = 20.dp)
        ) {


         **/


        Column( //column de register
            modifier = Modifier


                .padding(top = 355.dp, bottom = 10.dp, start = 30.dp, end = 20.dp)

        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = crevette
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
                    //.padding(bottom = 25.dp)
                    .padding(top = 10.dp),
                contentPadding = PaddingValues(vertical = 14.dp),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 2.dp
                ),
                shape = Shapes.medium
            ) {
                Text(
                    text = "Sign In",
                    // fontFamily = Poppins,
                    color = SecondaryColor,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            } //fin bouton Sign in
        }


        Column( //column de register
            modifier = Modifier


                .padding(top = 440.dp, bottom = 10.dp, start = 50.dp, end = 20.dp)

        ) {


            /////////////////// register ////////////////

            Text(
                text = "Already have an account? Log In !",
                style = MaterialTheme.typography.body2,
                textAlign = TextAlign.Center,
                modifier = Modifier.clickable {
                    // Naviguez vers la classe Register ici
                    // navController.navigate("register")
                },

                )
        }


    } //fin card

}




        //fin fonction
