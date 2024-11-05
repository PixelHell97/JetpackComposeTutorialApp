package com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.pixel.restarttechnologyassignment.ui.generatedIcons.MyIconPack

public val MyIconPack.`Home-simple-door`: ImageVector
    get() {
        if (`_home-simple-door` != null) {
            return `_home-simple-door`!!
        }
        `_home-simple-door` =
            Builder(
                name = "Home-simple-door",
                defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 25.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFF21B6B6)),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = Round,
                    strokeLineJoin =
                        StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(9.5f, 21.0f)
                    horizontalLineTo(7.5f)
                    curveTo(5.2909f, 21.0f, 3.5f, 19.2091f, 3.5f, 17.0f)
                    verticalLineTo(10.7076f)
                    curveTo(3.5f, 9.3089f, 4.2306f, 8.0118f, 5.4268f, 7.2868f)
                    lineTo(10.4268f, 4.2565f)
                    curveTo(11.7011f, 3.4842f, 13.2989f, 3.4842f, 14.5732f, 4.2565f)
                    lineTo(19.5732f, 7.2868f)
                    curveTo(20.7694f, 8.0118f, 21.5f, 9.3089f, 21.5f, 10.7076f)
                    verticalLineTo(17.0f)
                    curveTo(21.5f, 19.2091f, 19.7091f, 21.0f, 17.5f, 21.0f)
                    horizontalLineTo(15.5f)
                    moveTo(9.5f, 21.0f)
                    verticalLineTo(17.0f)
                    curveTo(9.5f, 15.3431f, 10.8431f, 14.0f, 12.5f, 14.0f)
                    verticalLineTo(14.0f)
                    curveTo(14.1569f, 14.0f, 15.5f, 15.3431f, 15.5f, 17.0f)
                    verticalLineTo(21.0f)
                    moveTo(9.5f, 21.0f)
                    horizontalLineTo(15.5f)
                }
            }.build()
        return `_home-simple-door`!!
    }

private var `_home-simple-door`: ImageVector? = null
