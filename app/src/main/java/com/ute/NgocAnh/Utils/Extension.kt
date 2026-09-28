package com.ute.NgocAnh.Utils

import android.view.View
import android.content.Context
import android.widget.Toast
import android.graphics.Color

fun View.show() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun Context.toast(
    message: String,
    duration: Int = Toast.LENGTH_SHORT
) {
    Toast.makeText(this, message, duration).show()
}

fun Double.toAcademicRanking(): String = when {
    this >= 3.6 -> "Xuất sắc"
    this >= 3.2 -> "Giỏi"
    this >= 2.5 -> "Khá "
    this >= 2.0 -> "Trung bình"
    this >= 1.0 -> "Yếu"
    else -> "Kém "
}

fun Double.toRankingColor(): Int = when { //thêm màu
    this >= 3.6 -> Color.parseColor("#34B469")
    this >= 3.2 -> Color.parseColor("#00BCD4")
    this >= 2.5 -> Color.parseColor("#FF9800")
    else -> Color.parseColor("#F44336")
}