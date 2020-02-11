package raul.molina.myfirstapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.random.Random

class MainActivity : Activity() {

    //var counter: Int = 0
    var num: Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label:TextView = findViewById(R.id.etiqueta) as TextView
        val down:Button = findViewById(R.id.Down) as Button
        val up:Button = findViewById(R.id.Up) as Button
        val generate: Button = findViewById(R.id.generate) as Button

       generate.setOnClickListener {
          //counter++
           num = Random.nextInt(0,100)
           label.setText(""+num+"")
       }

        up.setOnClickListener {
            var aux: Int = num
            var x: Int = 0
            x = Random.nextInt(aux,100)
            label.setText(""+x+"")



        }
        down.setOnClickListener {
            var aux: Int = num
            var x: Int = 0
            x = Random.nextInt(0,aux)
            label.setText(""+x+"")
        }

    }
}
