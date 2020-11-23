package com.example.startandroidpainting145

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.view.View

class DrawPolyToPoly(context: Context) : View(context) {

    private var paint = Paint()
    private var path = Path()
    private var pathDst = Path()
    private var rectangle = RectF(100f, 100f, 200f, 200f)
    private val matrixInner = Matrix()
    private var src = FloatArray(2)
    private var dst = FloatArray(2)

    init {
        paint.strokeWidth = 3f
        paint.style = Paint.Style.STROKE
        src[0] = 100f
        src[1] = 100f
        dst[0] = 150f
        dst[1] = 120f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas ?: return
        canvas.drawARGB(80, 102, 204, 255)

        // зеленый квадрат
        path.reset()
        path.addRect(rectangle, Path.Direction.CW)
        paint.color = Color.GREEN
        canvas.drawPath(path, paint)

        // преобразование
        matrixInner.setPolyToPoly(src, 0, dst, 0, 1)
        path.transform(matrixInner, pathDst)

        // синий квадрат
        paint.color = Color.BLUE
        canvas.drawPath(pathDst, paint)
    }

}