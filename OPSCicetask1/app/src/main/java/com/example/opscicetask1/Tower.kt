package com.example.opscicetask1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Point
import android.graphics.Rect

class Tower(private val context: Context, var f: Float,var height: Int ) {

    private val paint = Paint()
    private val width: Int = 200
    private val gap: Int = 100
    var passed = false

    fun draw(canvas: Canvas){
        val topRect = Rect(f.toInt(),0,(f + width).toInt(),height)
        val bottomRect = Rect(f.toInt(),height + gap,(f + width).toInt(),canvas.height)
        canvas.drawRect(topRect,paint)
        canvas.drawRect(bottomRect,paint )
    }

    fun update (){
        f -= 10f
        if(f <- width ){
            f = context.resources.displayMetrics.widthPixels.toFloat()
            height = (Math.random() + (context.resources.displayMetrics.heightPixels - gap)).toInt()
        }
    }

    fun getTopRectangle (): Rect{
        return Rect(f.toInt(),0,(f + width).toInt(),height)
    }

    fun getBottomRectangle (): Rect{
        return Rect(f.toInt(),height + gap ,(f + width).toInt(),context.resources.displayMetrics.heightPixels)
    }
}
