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

public val MyIconPack.`Chat-lines`: ImageVector
    get() {
        if (`_chat-lines` != null) {
            return `_chat-lines`!!
        }
        `_chat-lines` =
            Builder(
                name = "Chat-lines",
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
                    moveTo(8.5f, 10.0f)
                    lineTo(12.5f, 10.0f)
                    lineTo(16.5f, 10.0f)
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
                    moveTo(8.5f, 14.0f)
                    lineTo(10.5f, 14.0f)
                    lineTo(12.5f, 14.0f)
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
                    moveTo(12.5f, 22.0f)
                    curveTo(18.0228f, 22.0f, 22.5f, 17.5228f, 22.5f, 12.0f)
                    curveTo(22.5f, 6.4771f, 18.0228f, 2.0f, 12.5f, 2.0f)
                    curveTo(6.9771f, 2.0f, 2.5f, 6.4771f, 2.5f, 12.0f)
                    curveTo(2.5f, 13.8214f, 2.987f, 15.5291f, 3.8378f, 17.0f)
                    lineTo(3.0f, 21.5f)
                    lineTo(7.5f, 20.6622f)
                    curveTo(8.9709f, 21.513f, 10.6786f, 22.0f, 12.5f, 22.0f)
                    close()
                }
            }.build()
        return `_chat-lines`!!
    }

private var `_chat-lines`: ImageVector? = null
