package com.example.startandroidpainting145

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.view.View

class DrawRectToRect(context: Context) : View(context) {

    private var paint = Paint()
    private var path = Path()
    private var pathDst = Path()
    private var bounds = RectF()
    private var rectangle = RectF()
    private val matrixInner = Matrix()

    init {
        paint.strokeWidth = 3f
        paint.style = Paint.Style.STROKE
        path.addCircle(200f, 100f, 50f, Path.Direction.CW)
        path.addCircle(200f, 225f, 75f, Path.Direction.CW)
        path.addCircle(200f, 400f, 100f, Path.Direction.CW)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas ?: return
        canvas.drawARGB(80, 102, 204, 255)

        rectangle.set(500f, 50f, 800f, 150f)

        //Рисуем снеговика
        paint.color = Color.BLUE
        canvas.drawPath(path, paint)

        path.computeBounds(bounds, true)
        paint.color = Color.GREEN
        canvas.drawRect(bounds, paint)

        paint.color = Color.BLACK
        canvas.drawRect(rectangle, paint)
        matrixInner.reset()
        matrixInner.setRectToRect(bounds, rectangle, Matrix.ScaleToFit.START)
        // преобразование
        path.transform(matrixInner, pathDst)
        paint.color = Color.BLUE
        canvas.drawPath(pathDst, paint)

        rectangle.offset(0f, 150f)

        paint.color = Color.BLACK
        canvas.drawRect(rectangle, paint)
        matrixInner.reset()
        matrixInner.setRectToRect(bounds, rectangle, Matrix.ScaleToFit.CENTER)
        // преобразование
        path.transform(matrixInner, pathDst)
        paint.color = Color.BLUE
        canvas.drawPath(pathDst, paint)

        rectangle.offset(0f, 150f)

        paint.color = Color.BLACK
        canvas.drawRect(rectangle, paint)
        matrixInner.reset()
        matrixInner.setRectToRect(bounds, rectangle, Matrix.ScaleToFit.END)
        // преобразование
        path.transform(matrixInner, pathDst)
        paint.color = Color.BLUE
        canvas.drawPath(pathDst, paint)

        rectangle.offset(0f, 150f)

        paint.color = Color.BLACK
        canvas.drawRect(rectangle, paint)
        matrixInner.reset()
        matrixInner.setRectToRect(bounds, rectangle, Matrix.ScaleToFit.FILL)
        // преобразование
        path.transform(matrixInner, pathDst)
        paint.color = Color.BLUE
        canvas.drawPath(pathDst, paint)
    }

}