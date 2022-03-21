package com.example.notes

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView

@SuppressLint("ServiceCast")
class AddToListView :RelativeLayout {
    lateinit var recyclerView : RecyclerView
    lateinit var editText: EditText
    constructor(context: Context) : super(context) {
//        init(context, null, -1, -1)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
//        init(context, attrs, -1, -1)
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
//        init(context, attrs, defStyleAttr, -1)
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
//        init(context, attrs, defStyleAttr, defStyleRes)
    }
    init {

        // get the inflater service from the android system
//
        LayoutInflater.from(context).inflate(R.layout.add_to_list_view, this, true)
    }


}