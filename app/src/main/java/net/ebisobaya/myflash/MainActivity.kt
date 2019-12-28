package net.ebisobaya.myflash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

var intBackGroundColor = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonEdit.setOnClickListener {
            val intent = Intent(this@MainActivity, WordListActivity::class.java)
            startActivity(intent)
        }

        buttonColor01.setOnClickListener {
            intBackGroundColor = R.color.color01
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor02.setOnClickListener {
            intBackGroundColor = R.color.color02
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor03.setOnClickListener {
            intBackGroundColor = R.color.color03
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor04.setOnClickListener {
            intBackGroundColor = R.color.color04
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor05.setOnClickListener {
            intBackGroundColor = R.color.color05
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttonColor06.setOnClickListener {
            intBackGroundColor = R.color.color06
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
    }
}
