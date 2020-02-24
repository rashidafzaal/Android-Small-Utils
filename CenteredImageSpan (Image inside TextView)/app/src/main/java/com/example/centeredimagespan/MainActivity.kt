package com.example.centeredimagespan

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.Spanned
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageSpan(myTextView)
    }

    fun imageSpan(textView: TextView) {
        var text = resources.getString(R.string.imageSpanText)
        var `$index` = text.indexOf("$")
        var span = Spannable.Factory.getInstance().newSpannable(text)
        span.setSpan(CenteredImageSpan(this, R.drawable.my_icon), `$index`, `$index` + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.setText(span)
    }
}
