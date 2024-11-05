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

public val MyIconPack.`Calendar`: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar =
            Builder(
                name = "Calendar",
                defaultWidth = 16.0.dp,
                defaultHeight =
                    16.0.dp,
                viewportWidth = 16.0f,
                viewportHeight = 16.0f,
            ).apply {
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
                    moveTo(10.0f, 2.6667f)
                    verticalLineTo(1.3333f)
                    moveTo(10.0f, 2.6667f)
                    verticalLineTo(4.0f)
                    moveTo(10.0f, 2.6667f)
                    horizontalLineTo(7.0f)
                    moveTo(2.0f, 6.6667f)
                    verticalLineTo(12.6667f)
                    curveTo(2.0f, 13.4031f, 2.597f, 14.0f, 3.3333f, 14.0f)
                    horizontalLineTo(12.6667f)
                    curveTo(13.4031f, 14.0f, 14.0f, 13.4031f, 14.0f, 12.6667f)
                    verticalLineTo(6.6667f)
                    horizontalLineTo(2.0f)
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
                    moveTo(2.0f, 6.6667f)
                    verticalLineTo(4.0f)
                    curveTo(2.0f, 3.2636f, 2.597f, 2.6667f, 3.3333f, 2.6667f)
                    horizontalLineTo(4.6667f)
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
                    moveTo(4.6667f, 1.3333f)
                    verticalLineTo(4.0f)
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
                    moveTo(14.0f, 6.6667f)
                    verticalLineTo(4.0f)
                    curveTo(14.0f, 3.2636f, 13.403f, 2.6667f, 12.6666f, 2.6667f)
                    horizontalLineTo(12.3333f)
                }
            }.build()
        return _calendar!!
    }

private var `_calendar`: ImageVector? = null
