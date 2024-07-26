package com.example.opscicetask1

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.SurfaceHolder
import android.view.SurfaceView

class GameView (context: Context) : SurfaceView(context),SurfaceHolder.Callback {
    private val thread: GameThread
    private val bird: Bird
    private val towers: mutableListOf<Tower>()
    private val paint: Paint()
            private val background: Bitmap
            private var score =0
    private var starttime: Long =0

    init {
        holder.addCallback(this)
        bird = Bird(context)
        towers.add(Tower(context,800f,400f))
        towers.add(Tower(context,160f , 300f))
        thread= GameThread(holder, this)
        background = BitmapFactory.decodeResource(resources,R.drawable.sky)
    }

    fun update() {

    }

    override fun draw(canvas: Canvas) {
        super.draw(canvas)

    }
}