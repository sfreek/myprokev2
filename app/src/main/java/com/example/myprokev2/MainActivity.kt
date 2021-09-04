package com.example.myprokev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var btn_generate: Button? = null

    private var inc_incom: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btn_generate = findViewById(R.id.btn_gen)
        inc_incom = findViewById(R.id.textView)





        btn_generate?.setOnClickListener {
            var generator=OpossumGroupGenerator(100,1)

            var opssi = generator.Generate()
            inc_incom?.text = ""

            var i: Int = 0
            for (item in opssi)
            {
                i++

                inc_incom?.append("Opossum #")
                inc_incom?.append(i.toString())

                inc_incom?.append(". Рост: ")
                inc_incom?.append(item.height.toString())
                inc_incom?.append(" ,Вес: ")
                inc_incom?.append(item.weight.toString())
                inc_incom?.append(" ,Сила: ")
                inc_incom?.append(item.strength.toString())
                inc_incom?.append(" ,Мана: ")
                inc_incom?.append(item.mana.toString())
                inc_incom?.append(" ,Child: ")
                inc_incom?.append(item.child.toString())
                inc_incom?.append("\n")

            }
        }


    }
}
