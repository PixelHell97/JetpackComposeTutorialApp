package com.pixel.jetpackcomposetutorialapp.ui.generatedIcons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.pixel.jetpackcomposetutorialapp.ui.generatedIcons.MyIconPack

public val MyIconPack.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic =
            Builder(
                name = "Mic",
                defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth =
                25.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFF6B7280)),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(12.5f, 2.0f)
                    lineTo(12.5f, 2.0f)
                    arcTo(3.0f, 3.0f, 0.0f, false, true, 15.5f, 5.0f)
                    lineTo(15.5f, 11.0f)
                    arcTo(3.0f, 3.0f, 0.0f, false, true, 12.5f, 14.0f)
                    lineTo(12.5f, 14.0f)
                    arcTo(3.0f, 3.0f, 0.0f, false, true, 9.5f, 11.0f)
                    lineTo(9.5f, 5.0f)
                    arcTo(3.0f, 3.0f, 0.0f, false, true, 12.5f, 2.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFF6B7280)),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = Round,
                    strokeLineJoin =
                        StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(5.5f, 10.0f)
                    verticalLineTo(11.0f)
                    curveTo(5.5f, 14.866f, 8.634f, 18.0f, 12.5f, 18.0f)
                    verticalLineTo(18.0f)
                    verticalLineTo(18.0f)
                    curveTo(16.366f, 18.0f, 19.5f, 14.866f, 19.5f, 11.0f)
                    verticalLineTo(10.0f)
                }
                path(
                    fill = SolidColor(Color(0x00000000)),
                    stroke = SolidColor(Color(0xFF6B7280)),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = Round,
                    strokeLineJoin =
                        StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(12.5f, 18.0f)
                    verticalLineTo(22.0f)
                    moveTo(12.5f, 22.0f)
                    horizontalLineTo(9.5f)
                    moveTo(12.5f, 22.0f)
                    horizontalLineTo(15.5f)
                }
            }.build()
        return _mic!!
    }

private var _mic: ImageVector? = null
