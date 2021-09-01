package com.hugorafaelcosta.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var alunos = arrayListOf("Hugo",
                "Danusa",
                "Nina")
        var primeiroAluno : TextView = findViewById(R.id.textView1)
        var segundoAluno : TextView = findViewById(R.id.textView2)
        var terceiroAluno : TextView = findViewById(R.id.textView3)

        primeiroAluno.text = alunos[0]
        segundoAluno.text = alunos[1]
        terceiroAluno.text = alunos[2]
    }
}