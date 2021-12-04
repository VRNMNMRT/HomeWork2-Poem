package com.example.homeworkpoem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TagText = "MainActivity"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TagText,"onCreate:\nАхматова Анна\nСжала руки под темной вуалью...\n«Отчего ты сегодня бледна?»")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TagText,"«onStart:\n— Оттого, что я терпкой печалью\nНапоила его допьяна.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TagText,"onResume:\nКак забуду? Он вышел, шатаясь,\nИскривился мучительно рот...")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TagText,"onPause:\nЯ сбежала, перил не касаясь,\nЯ бежала за ним до ворот.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TagText,"onStop:\nЗадыхаясь, я крикнула: «Шутка\nВсе, что было. Уйдешь, я умру».")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TagText,"onDestroy:\nУлыбнулся спокойно и жутко\nИ сказал мне: «Не стой на ветру»")
    }


}