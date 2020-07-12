package jp.techacademy.yoshiyuki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        val num1= editText1.text.toString().toDouble()
        val num2= editText2.text.toString().toDouble()
        var num3:Double = 0.0

        if (num1 != null && num2 != null) {
            /*どのボタンが押されたか制御
         １：＋　２：－　３：×　４：÷*/
            if (v.id == R.id.button1) {
                num3 = num1 + num2
            } else if (v.id == R.id.button2) {
                num3 = num1 - num2
            } else if (v.id == R.id.button3) {
                num3 = num1 * num2
            } else if (v.id == R.id.button4) {
                num3 = num1 / num2
            }
        }

        val intent = Intent(this, CalcActivity::class.java)
        //計算した値を渡す
        intent.putExtra("VALUE1", num3)

        startActivity(intent)

    }
}