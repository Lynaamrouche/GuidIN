package com.example.guidin.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.guidin.R
import com.example.guidin.ui.theme.*


@Composable
fun LoginScreenRecent() {
    Column(modifier = Modifier
        .fillMaxSize()
       // .background(color = BackgroundColorSetting)
    )
    {
        //BackgroundSetting()
       Login()
    }

}

    @Composable
    fun Login(/*navController: Any*/) {

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        var isPasswordOpen by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = "Start your journey with confidence - Secure your access  ",
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
                painter = painterResource(id = R.drawable.authentif3),
                contentDescription = "",
                modifier = Modifier.size(260.dp)
            )
        }


        Card(
            backgroundColor = lilas,
            elevation = 0.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(360.dp)

                .padding(top = 20.dp, bottom = 10.dp, start = 20.dp, end = 20.dp)

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

/////////////////////debut champs mail ///////////////////////////////////////////////////

                TextField(
                    value = email, onValueChange = { email = it },
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .padding(top = 20.dp),
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
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    ),
                    placeholder = {
                        Text(text = "user@xxxx.com", color = Color.Gray)
                    },
                    textStyle = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = Poppins
                    ) // fin texte
                )
/////////////////////fin champs mail ///////////////////////////////////////////////////


/////////////////////debut champs mdp ///////////////////////////////////////////////////


                TextField(
                    value = password, onValueChange = { password = it },
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .padding(top = 10.dp),
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
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    placeholder = {
                        Text(text = "********", color = Color.Gray)
                    },
                    textStyle = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = Poppins
                    ) // fin texte
                )


/////////////////////fin champs mdp ///////////////////////////////////////////////////


                /////////////////////debut bouton se connecter ///////////////////////////////////////////////////

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = crevette
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
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
                        text = "Log In",
                        // fontFamily = Poppins,
                        color = SecondaryColor,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                } //fin bouton go


/////////////////////fin bouton se connecter ///////////////////////////////////////////////////

/////////////////////debut lien forgot password  ///////////////////////////////////////////////////
                /**
                TextButton(onClick = {}) {
                Text(text = "Forot Password ?",
                color = Color.Black,
                //fontFamily = Poppins,
                fontSize = 12.sp,
                //  modifier = Modifier.padding(top = 5.dp)
                )
                }
                 **/

            Box(
                modifier = Modifier

                    .padding(start = 20.dp)
            ) {

                Column( //column de register
                    modifier = Modifier


                        .padding(top = 10.dp, bottom = 10.dp, start = 30.dp, end = 20.dp)

                ) {


                    /////////////////// register ////////////////

                    Text(
                        text = "Don't have an account yet? Register here!",
                        style = MaterialTheme.typography.body2,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.clickable {
                            // Naviguez vers la classe Register ici
                            // navController.navigate("register")
                        },

                        )
                }
///////////////////////// fin register ////////////////////////
/////////////////////debut  lien forgot password  ///////////////////////////////////////////////////
                Column(
                    modifier = Modifier


                        .padding(top = 30.dp, bottom = 10.dp, start = 70.dp, end = 20.dp)


                ) {


                    /////////////////// register ////////////////

                    Text(
                        text = "Forgot your password ?",
                        textAlign = TextAlign.Center,

                        style = MaterialTheme.typography.body2,


                        modifier = Modifier.clickable {
                            // Naviguez vers la classe Register ici
                            // navController.navigate("register")
                        },

                        )
                }

            }
            } // fin column

        } //fin card
    }// fin login
