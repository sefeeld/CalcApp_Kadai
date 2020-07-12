package jp.techacademy.yoshiyuki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc.*

class CalcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)

        textView.text = "${value1}"
    }
}
