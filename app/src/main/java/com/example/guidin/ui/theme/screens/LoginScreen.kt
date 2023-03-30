package com.example.guidin.ui.theme.screens

import android.graphics.drawable.Icon
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
//import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
import androidx.compose.material.Text as Text

@Composable
fun LoginScreen(){
    //Text(text = "hello from Login")
    BackgroundImage()
    LoginArea()
}

@Composable
fun LoginArea() {


    var email by remember{ mutableStateOf("")}
    var password by remember {
        mutableStateOf("")
    }

    var isPasswordOpen by remember{ mutableStateOf(false) }



    Box(
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            /** Text (text = "Hello",
            fontSize = 28.dp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(top = 20.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = Reemkufi)
             **/
            /*     Text (text = "WELCOME TO GUIDIN",
                     color = Color.Black,
                     fontSize = 30.sp,
                     fontWeight = FontWeight.Bold,
                     //fontFamily = Reemkufi
                     textAlign = TextAlign.Center,
                     //modifier = Modifier.width(150.dp),
                     modifier = Modifier
                         .fillMaxWidth()
                         .padding(horizontal = 20.dp)
                         .padding(bottom = 0.dp)
                         .padding(top = 20.dp),
                     //fontFamily = Reemkufi

           )   **/
///////////////////////// Continuer avec google ////////////////////////
            Button(onClick = {},
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(bottom = 0.dp),
            ) {

                Row(verticalAlignment = Alignment.CenterVertically)
                {
                    Icon(
                        painter = painterResource(id = R.drawable.compte_google),
                        contentDescription = "",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(26.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Continue with Google",
                        color = Color.White,
                        fontSize = 16.sp
                    )

                }
            }

///////////////////////////// debut formulaire de conenxion  /////////////////////////////////
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
                    .padding(bottom = 20.dp)
                    .padding(horizontal = 20.dp),

                backgroundColor = Conexioncolor,
                elevation = 0.dp,
                shape = BottomBoxShape.medium

            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = "Log In with Email",
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .padding(bottom = 40.dp)
                    )
////////////////////////////////// champs mail ///////////////////////////////////
                    OutlinedTextField(value = email, onValueChange = { email = it},
                        label = {
                            Text( text = "Email Adress" , color = PrimaryColor)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            unfocusedBorderColor = PrimaryColor,
                            focusedBorderColor = PrimaryColor,
                            textColor = PrimaryColor,
                        ),

                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Email
                        ),

                        singleLine = true,
                        leadingIcon = {
                            Icon(painter = painterResource(id = R.drawable.ic_email), contentDescription = "",
                                tint = PrimaryColor,
                                modifier = Modifier.size(24.dp))
                        }
                    )
                    ///////////////////////////// fin champs email /////////////////////////////////
////////////////////////////////// champs password ///////////////////////////////////

                    OutlinedTextField(value = password, onValueChange = { password = it},
                        label = {
                            Text( text = "password" , color = PrimaryColor)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            unfocusedBorderColor = PrimaryColor,
                            focusedBorderColor = PrimaryColor,
                            textColor = PrimaryColor,
                        ),

                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Password
                        ),

                        singleLine = true,
                        leadingIcon = {
                            Icon(painter = painterResource(id = R.drawable.ic_password), contentDescription = "",
                                tint = PrimaryColor,
                                modifier = Modifier.size(24.dp))
                        },
                        visualTransformation = if (!isPasswordOpen){PasswordVisualTransformation() }
                        else{ VisualTransformation.None }
                        ,
                        trailingIcon = {
                            IconButton(onClick = { isPasswordOpen = !isPasswordOpen  }) {
                                if (!isPasswordOpen) {
                                    Icon(painter = painterResource(id = R.drawable.ic_eye_open),
                                        contentDescription = "",
                                        tint = PrimaryColor,
                                        modifier = Modifier.size(24.dp)
                                    )
                                } else {
                                    Icon(painter = painterResource(id = R.drawable.ic_eye_close),
                                        contentDescription = "",
                                        tint = PrimaryColor,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }

                            }



                        }
                    ) // fin champs password
///////////////////////////// fin champs password /////////////////////////////////
///////////////////////////// debut bouton Login  /////////////////////////////////

                    Button (onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 20.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = PrimaryColor,
                            contentColor = Color.White
                        ),
                        contentPadding = PaddingValues(vertical = 14.dp)
                    ) {
                        Text(text = "Login"
                            //fontFamily = Poppins,
                        )
                    }
///////////////////////////// Password forget /////////////////////////////////

                    TextButton(onClick = {}) {
                        Text(text = "Forot Password ?",
                            color = LightTextColor,
                            //fontFamily = Poppins,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(top = 15.dp)
                        )
                    }
                    ///////////////////////////// fin Password forget /////////////////////////////////
///////////////////////////// debut have already  an account  /////////////////////////////////

                    TextButton(onClick = {}) {
                        Text(text = " Don't Have an Account ? Sign Up ",
                            color = LightTextColor,
                            fontFamily = Poppins,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }
                    //     Spacer(modifier = Modifier.height(.dp))



///////////////////////////// fin have already  an account /////////////////////////////////

///////////////////////////// fin boutton Login /////////////////////////////////

                }
            }





        }
    }
}



@Composable
fun BackgroundImage() {
    Box (
        contentAlignment = Alignment.TopCenter
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.logo_complet_removebg), contentDescription = "",
                    modifier = Modifier
                        //.fillMaxSize()
                        //.fillMaxHeight()
                        .fillMaxWidth()
                    // .padding(bottom = 80.dp)


                )
            }
        }

    }
}
