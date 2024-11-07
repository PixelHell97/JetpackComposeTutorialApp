package com.pixel.jetpackcomposetutorialapp.ui.generatedIcons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.pixel.jetpackcomposetutorialapp.ui.generatedIcons.MyIconPack

public val MyIconPack.`Help-circle`: ImageVector
    get() {
        if (`_help-circle` != null) {
            return `_help-circle`!!
        }
        `_help-circle` =
            Builder(
                name = "Help-circle",
                defaultWidth = 25.0.dp,
                defaultHeight =
                    24.0.dp,
                viewportWidth = 25.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFF9CA3AF)),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = Round,
                    strokeLineJoin =
                        StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(12.5f, 22.0f)
                    curveTo(18.0228f, 22.0f, 22.5f, 17.5228f, 22.5f, 12.0f)
                    curveTo(22.5f, 6.4771f, 18.0228f, 2.0f, 12.5f, 2.0f)
                    curveTo(6.9771f, 2.0f, 2.5f, 6.4771f, 2.5f, 12.0f)
                    curveTo(2.5f, 17.5228f, 6.9771f, 22.0f, 12.5f, 22.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFF9CA3AF)),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = Round,
                    strokeLineJoin =
                        StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(9.5f, 9.0f)
                    curveTo(9.5f, 5.5f, 15.0f, 5.5f, 15.0f, 9.0f)
                    curveTo(15.0f, 11.5f, 12.5f, 10.9999f, 12.5f, 13.9999f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFF9CA3AF)),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = Round,
                    strokeLineJoin =
                        StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(12.5f, 18.01f)
                    lineTo(12.51f, 17.9989f)
                }
            }.build()
        return `_help-circle`!!
    }

private var `_help-circle`: ImageVector? = null
