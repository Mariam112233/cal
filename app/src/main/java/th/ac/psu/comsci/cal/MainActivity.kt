package th.ac.psu.comsci.cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val number3 = findViewById<EditText>(R.id.number3)
        val result = findViewById<TextView>(R.id.result)
        val plus = findViewById<Button>(R.id.plusBtn)
       /* val minus = findViewById<Button>(R.id.minusBtn)
        val multiply = findViewById<Button>(R.id.multiplyBtn)*/

        plus.setOnClickListener{
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            val num3 = number3.text.toString().toDouble()
            val ans = num1 + num2 + num3
            result.setText(ans.toString())

        }
       /* minus.setOnClickListener{
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            val ans = num1 - num2
            result.setText(ans.toString())

        }
        multiply.setOnClickListener{
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            val ans = num1 * num2
            result.setText(ans.toString())


        }*/
    }
}
