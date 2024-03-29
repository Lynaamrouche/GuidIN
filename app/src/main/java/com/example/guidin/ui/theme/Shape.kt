package com.example.guidin.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(16.dp)
)

val BottomBoxShape= Shapes(
    medium = RoundedCornerShape(topStart = 14.dp , topEnd = 14.dp)

)

val InputBoxShape = Shapes(
    medium = RoundedCornerShape(14.dp)
)

val InputBoxShapeSmall = Shapes(
    small = RoundedCornerShape(14.dp)
)