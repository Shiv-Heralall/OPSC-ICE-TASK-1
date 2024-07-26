package com.example.opscicetask1

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect

class Bird(context: Context) {
    private var birdbitmap: Bitmap = BitmapFactory.decodeResource(context.resources,R.drawable.bird)
    var x: Float = 100f
    var y: Float = 100f
    var velocity: Float = 10f

fun draw (canvas: Canvas, paint: Paint) {
    canvas.drawBitmap(birdbitmap, x, y, paint)
}
    fun update (){
        y += velocity
        velocity += 1f
    }

    fun flap(){
        velocity = -20f
    }

    fun getRectangle(): Rect {
        return Rect(x.toInt(),y.toInt(),(x + birdbitmap.width).toInt(),(y + birdbitmap.height).toInt())
    }
}