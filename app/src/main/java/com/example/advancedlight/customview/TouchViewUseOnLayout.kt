package com.example.advancedlight.customview

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

class TouchViewUseOnLayout : View {
    private var lastX: Int = 0
    private var lastY: Int = 0

    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr)

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = event.x.toInt()
        val y = event.y.toInt()
        when(event.action) {
            MotionEvent.ACTION_DOWN -> {
                lastX = x
                lastY = y
            }
            MotionEvent.ACTION_MOVE -> {
                val offsetX = x - lastX
                val offsetY = y - lastY
                layout(left + offsetX, top + offsetY, right + offsetX, bottom + offsetY)
//                val marginLayoutParams = layoutParams as LinearLayout.LayoutParams
//                marginLayoutParams.leftMargin = left + offsetX
//                marginLayoutParams.topMargin = top + offsetY
//                layoutParams = marginLayoutParams
            }
        }
        return true
    }
}

