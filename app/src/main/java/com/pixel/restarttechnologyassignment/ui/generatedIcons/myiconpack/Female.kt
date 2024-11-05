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

public val MyIconPack.Female: ImageVector
    get() {
        if (_female != null) {
            return _female!!
        }
        _female =
            Builder(
                name = "Female",
                defaultWidth = 17.0.dp,
                defaultHeight = 16.0.dp,
                viewportWidth = 17.0f,
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
                    moveTo(8.6667f, 10.0f)
                    curveTo(10.8758f, 10.0f, 12.6667f, 8.2091f, 12.6667f, 6.0f)
                    curveTo(12.6667f, 3.7909f, 10.8758f, 2.0f, 8.6667f, 2.0f)
                    curveTo(6.4576f, 2.0f, 4.6667f, 3.7909f, 4.6667f, 6.0f)
                    curveTo(4.6667f, 8.2091f, 6.4576f, 10.0f, 8.6667f, 10.0f)
                    close()
                    moveTo(8.6667f, 10.0f)
                    verticalLineTo(12.6667f)
                    moveTo(8.6667f, 14.0f)
                    verticalLineTo(12.6667f)
                    moveTo(8.6667f, 12.6667f)
                    horizontalLineTo(7.3334f)
                    moveTo(8.6667f, 12.6667f)
                    horizontalLineTo(10.0f)
                }
            }.build()
        return _female!!
    }

private var _female: ImageVector? = null
