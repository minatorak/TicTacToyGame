package com.example.minato.tictactoygame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatButton
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun btnClick(view: View){
        val Selected:AppCompatButton = view as AppCompatButton
        var idButton = 0
        when(Selected.id){
            R.id.btn1 -> idButton =11
            R.id.btn2 -> idButton =2
            R.id.btn3 -> idButton =3
            R.id.btn4 -> idButton =4
            R.id.btn5 -> idButton =5
            R.id.btn6 -> idButton =6
            R.id.btn7 -> idButton =7
            R.id.btn8 -> idButton =8
            R.id.btn9 -> idButton =9
        }
        playGame(idButton,Selected)
        Toast.makeText(this,"ID Click :$idButton",Toast.LENGTH_SHORT).show()
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var nowPlayer = 1

    fun playGame(idButton:Int,view:AppCompatButton){

        if (nowPlayer==1){
            view.text = "X"
            nowPlayer = 0
        }else{
            view.text = "O"
            nowPlayer = 1
        }

        view.isEnabled = false
    }

}
