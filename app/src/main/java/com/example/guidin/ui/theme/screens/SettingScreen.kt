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
        .background(color = lilas)
    )
        {
        //BackgroundSetting()
        HeaderText()
        ProfilCardUI()
        GeneralOptionUI()
        SupportOptionUI()
    }

}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SupportOptionUI() {

    Column(modifier = Modifier
        .padding(top = 3.dp)
        .padding(horizontal = 14.dp)) {
        Text(
            text = "Support",
            color = Color.Black,
            fontSize = 16.sp,
            modifier = Modifier.padding(vertical = 8.dp)
        )
/////////////////////////////// Contact  ///////////////////

        SupportOptionItem(
            Icon =R.drawable.contact_support,
            mainText ="Contact US",
            onClick = {
                //click event here
            }

        )
/////////////////////////////// FAQ  ///////////////////
        SupportOptionItem(
        Icon =R.drawable.quiz,
        mainText ="F A Q",
        onClick = {
            //click event here
        } )
/////////////////////////////// Privacy Police   ///////////////////

        SupportOptionItem(
            Icon =R.drawable.admin_panel_settings,
            mainText ="Privacy Police",
            onClick = {
                //click event here
            } )

/////////////////////////////// About US   ///////////////////
        SupportOptionItem(
            Icon =R.drawable.info,
            mainText ="About",
            onClick = {
                //click event here
            } )


    }

}



@ExperimentalMaterialApi
@Composable
fun SupportOptionItem(
    Icon:Int,
    mainText:String,
    onClick:()->Unit
) {

    Card(
        onClick = {
            onClick()
        },
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth(),
        elevation = 0.dp
    ) {
        Row(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .padding(horizontal = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically)
            {
                Box(
                    modifier = Modifier
                        .size(34.dp)
                        .clip(shape = Shapes.medium)
                        .background(LightPrimaryColor)

                )
                {
                    Icon(
                        painter = painterResource(Icon),
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.padding(8.dp)
                    )
                }
                Spacer(modifier = Modifier.width(14.dp))
            }
            Column() {
/////////////////////////////////// Contact  ////////////////////////////////

                Text( //modifier = Modifier.padding(horizontal = 10.dp),
                    text = mainText,
                    color = Color.Black,
                    textAlign = TextAlign.Center,

                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }

        Icon(
            painter = painterResource(id = R.drawable.navigate_next),
            contentDescription = "next",
            tint = Color.Black,
            modifier = Modifier.size(16.dp)
        )
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GeneralOptionUI() {
    Column(modifier = Modifier
        .padding(top = 3.dp)
        .padding(horizontal = 14.dp)) {
        Text (text = "General",
            color = Color.Black,
            fontSize = 16.sp,
            modifier = Modifier.padding(vertical = 8.dp)
        )
//////////////////////// customize more ////////
        GeneralSettingsItem(
            Icon =R.drawable.manage_accounts,
            mainText ="Manage Profil",
            subText = "Custumize more your profil",
            onClick = {
                //click event here
            }
        )

        /////////////////////////////// travel history ///////////////////
        GeneralSettingsItem(
            Icon =R.drawable.history,
            mainText ="Travel history",
            subText = "Check your Last travels",
            onClick = {
                //click event here
            }
        )


    }
}

@ExperimentalMaterialApi
@Composable
fun GeneralSettingsItem(
    Icon:Int,
    mainText:String,
    subText:String,
    onClick:()->Unit
) {
    Card(
        onClick = {
                  onClick()
        },
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth(),
        elevation = 0.dp
    ) {
        Row(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .padding(horizontal = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically)
            {
                Box(
                    modifier = Modifier
                        .size(34.dp)
                        .clip(shape = Shapes.medium)
                        .background(LightPrimaryColor)

                )
                {
                    Icon(
                        painter = painterResource(Icon),
                        contentDescription = "",
                        tint = Color.Black,
                        modifier = Modifier.padding(8.dp)
                    )
                }
                Spacer(modifier = Modifier.width(14.dp))
                Column() {
/////////////////////////////////// Travel history ////////////////////////////////

                    Text( //modifier = Modifier.padding(horizontal = 10.dp),
                        text = mainText,
                        color = Color.Black,
                        textAlign = TextAlign.Center,

                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )

                    Text( //modifier = Modifier.padding(horizontal = 10.dp),
                        text = subText,
                        color = Color.Gray,
                        //textAlign = TextAlign.Center,

                        fontWeight = FontWeight.SemiBold,
                        fontSize = 10.sp,
                        modifier = Modifier.offset(y = (-4).dp)
                            //.padding(horizontal = 10.dp)
                            .padding(top = 5.dp)
                    )

                }
            }

            Icon(
                painter = painterResource(id = R.drawable.navigate_next),
                contentDescription = "next",
                tint = Color.Black,
                modifier = Modifier.size(16.dp)
            )
            /////////////////////////////////// Travel history ////////////////////////////////
        }



    }
}
@Composable
fun ProfilCardUI() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(50.dp)
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
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = crevette
                    ),
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
