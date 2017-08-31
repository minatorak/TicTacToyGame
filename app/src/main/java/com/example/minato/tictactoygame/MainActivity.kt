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
            R.id.btn2 -> idButton =12
            R.id.btn3 -> idButton =13
            R.id.btn4 -> idButton =21
            R.id.btn5 -> idButton =22
            R.id.btn6 -> idButton =23
            R.id.btn7 -> idButton =31
            R.id.btn8 -> idButton =32
            R.id.btn9 -> idButton =33
        }
        PlayGame(idButton,Selected)
        Toast.makeText(this,"ID Click :$idButton",Toast.LENGTH_SHORT).show()
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var nowPlayer = 1

    fun PlayGame(idButton:Int,view:AppCompatButton){
        var CheckPoint:ArrayList<Int>
        if (nowPlayer==1){
            view.text = "X"
            player1.add(idButton)
            CheckPoint = player1
            nowPlayer = 0
        }else{
            view.text = "O"
            player2.add(idButton)
            CheckPoint = player2
            nowPlayer = 1
        }
        view.isEnabled = false
        CheckWin(CheckPoint)
    }

    fun CheckWin(Point:ArrayList<Int>){


    }
}
