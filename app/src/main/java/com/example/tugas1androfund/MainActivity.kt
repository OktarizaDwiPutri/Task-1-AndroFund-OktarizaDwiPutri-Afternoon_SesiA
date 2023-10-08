package com.example.tugas1androfund

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {



    private lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView2)

        val username = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username: $username dan Password: $password"

        val btn_implisit : Button = findViewById(R.id.btn_implisit)
        btn_implisit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_implisit -> {
//                val intent = Intent ()
//              val message = "hallo tes"
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//               intent.type = "text/plain"
//                startActivity(intent)

                val intent = Intent()
                    intent.putExtra("history", "Anda sudah login")
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}