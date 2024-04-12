package com.ifs21028.delcomtodo.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DelcomTodo(
    val id: Int,
    val title: String,
    val description: String,
    var isFinished: Boolean,
    val cover: String?,
) : Parcelable
