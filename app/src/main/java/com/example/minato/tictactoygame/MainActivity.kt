package com.example.minato.tictactoygame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatButton
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var click: Boolean = true
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var nowPlayer = 1
    val PlayerN:String = "ผู้เล่น"
    val PlayerAi:String = "Ai"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onClickResetGame(view: View){
        btn1.text = " "
        btn2.text = " "
        btn3.text = " "
        btn4.text = " "
        btn5.text = " "
        btn6.text = " "
        btn7.text = " "
        btn8.text = " "
        btn9.text = " "

        nowPlayer = 1
        player1 = ArrayList<Int>()
        player2 = ArrayList<Int>()
        click = true
    }

    fun btnClick(view: View) {
        val Selected: AppCompatButton = view as AppCompatButton
        var idButton = 0
        when (Selected.id) {

            R.id.btn1 -> idButton = 11
            R.id.btn2 -> idButton = 12
            R.id.btn3 -> idButton = 13

            R.id.btn4 -> idButton = 21
            R.id.btn5 -> idButton = 22
            R.id.btn6 -> idButton = 23

            R.id.btn7 -> idButton = 31
            R.id.btn8 -> idButton = 32
            R.id.btn9 -> idButton = 33

        }
        playGame(idButton, Selected)
        Toast.makeText(this, "ID Click :$idButton", Toast.LENGTH_SHORT).show()
    }



    fun playGame(idButton: Int, view: AppCompatButton) {
        if (click) {
            val CheckPoint: ArrayList<Int>
            if (nowPlayer == 1) {
                view.text = "X"
                player1.add(idButton)
                CheckPoint = player1
                checkWin(CheckPoint)
                nowPlayer = 0
            } else {
                view.text = "O"
                player2.add(idButton)
                CheckPoint = player2
                nowPlayer = 1
            }
            view.isEnabled = false
            checkWin(CheckPoint)
        }
    }

    fun checkWin(Point: ArrayList<Int>) {
        if (Point.contains(11) && Point.contains(12) && Point.contains(13)) {
            gameEnd()
        }else if (Point.contains(21) && Point.contains(22) && Point.contains(23)){
            gameEnd()
        }else if (Point.contains(31) && Point.contains(32) && Point.contains(33)){
            gameEnd()
        }else if(Point.contains(11) && Point.contains(21) && Point.contains(31)){
            gameEnd()
        }else if(Point.contains(12) && Point.contains(22) && Point.contains(32)){
            gameEnd()
        }else if(Point.contains(13) && Point.contains(23) && Point.contains(33)){
            gameEnd()
        }else if(Point.contains(11) && Point.contains(22) && Point.contains(33)){
            gameEnd()
        }else if(Point.contains(13) && Point.contains(22) && Point.contains(31)){
            gameEnd()
        }
    }


    fun gameEnd(){
        click = false
    }
}
