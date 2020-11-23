package com.example.startandroidpainting145

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.view.View

class DrawPolyToPoly3Dots(context: Context) : View(context) {

    var p = Paint().apply {
        strokeWidth = 3f
        style = Paint.Style.STROKE
    }
    var pBlack = Paint().apply {
        color = Color.BLACK
        strokeWidth = 3f
    }
    var pGray = Paint().apply {
        color = Color.GRAY
        strokeWidth = 3f
    }
    var path = Path()
    var pathDst = Path()
    var rectf = RectF(100f, 100f, 200f, 200f)
    var matrixInner = Matrix()
    var src = floatArrayOf(100f, 100f, 200f, 200f, 200f, 100f)
    var dst = floatArrayOf(50f, 300f, 250f, 500f, 230f, 350f)
    var dst2 = floatArrayOf(400f, 200f, 500f, 200f, 440f, 100f)
    var points = 3

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas ?: return
        canvas.drawARGB(80, 102, 204, 255)

        path.reset()
        path.addRect(rectf, Path.Direction.CW)
        p.color = Color.GREEN
        canvas.drawPath(path, p)
        canvas.drawLine(src[0], src[1], src[2], src[3], pBlack)
        canvas.drawLine(src[0], src[1], src[4], src[5], pGray)

        matrixInner.setPolyToPoly(src, 0, dst, 0, points)
        path.transform(matrixInner, pathDst)

        p.color = Color.BLUE
        canvas.drawPath(pathDst, p)
        canvas.drawLine(dst[0], dst[1], dst[2], dst[3], pBlack)
        canvas.drawLine(dst[0], dst[1], dst[4], dst[5], pGray)

        matrixInner.setPolyToPoly(src, 0, dst2, 0, points)
        path.transform(matrixInner, pathDst)
        p.color = Color.RED
        canvas.drawPath(pathDst, p)
        canvas.drawLine(dst2[0], dst2[1], dst2[2], dst2[3], pBlack)
        canvas.drawLine(dst2[0], dst2[1], dst2[4], dst2[5], pGray)
    }

}