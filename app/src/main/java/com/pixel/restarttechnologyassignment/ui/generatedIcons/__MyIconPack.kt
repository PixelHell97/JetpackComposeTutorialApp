package com.pixel.restarttechnologyassignment.ui.generatedIcons

import androidx.compose.ui.graphics.vector.ImageVector
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.`Birthday-cake`
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Calendar
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.`Chat-lines`
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.`Design-nib`
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Female
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.`Help-circle`
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.`Home-simple-door`
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Male
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Mic
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Page
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.`Profile-circle`
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
    get() {
        if (__AllIcons != null) {
            return __AllIcons!!
        }
        __AllIcons =
            listOf(
                `Chat-lines`,
                Female,
                Male,
                Mic,
                `Calendar`,
                `Birthday-cake`,
                `Home-simple-door`,
                `Profile-circle`,
                `Help-circle`,
                `Design-nib`,
                Page,
            )
        return __AllIcons!!
    }