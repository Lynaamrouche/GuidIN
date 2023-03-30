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

/**
@Composable
fun GuidageScreen(){
    Column(
        modifier = Modifier
            //.background(color = BackgroundColorSetting)
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        SearchDest()
    }
}

@Composable
fun SearchDest() {

    //selectedIndex sera utilisée pour stocker l'index de la destination sélectionnée.

    var selectedIndex by remember { mutableStateOf(0) }
    val destinations = listOf("Salle51", "Biblio", "Audito", "scolarite", "Cafeteria")
    var destination by remember { mutableStateOf("") }
    var isExpanded by remember { mutableStateOf(false) }

    Box {
        Button(
            onClick = { isExpanded = !isExpanded },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(destination)
        }
        DropdownMenu(
            modifier = Modifier.fillMaxWidth(),
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false }
        ) {
            destinations.forEachIndexed { index, dest ->
                DropdownMenuItem(
                    onClick = {
                        selectedIndex = index
                       destination = dest
                        isExpanded = false
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = destination)
                }
            }
        }
    }
}





**/



