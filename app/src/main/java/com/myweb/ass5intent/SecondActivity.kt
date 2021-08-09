package com.myweb.ass5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.myweb.ass5intent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var bindingSecond : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingSecond = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingSecond.root)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")

        bindingSecond.nameText.text = "Employee Name : ${newEmployee?.name}"
        bindingSecond.genderText.text  = "Gender : ${newEmployee?.gender}"
        bindingSecond.emailText.text  = "E-mail : ${newEmployee?.email}"
        bindingSecond.salaryText.text  = "Salary : ${newEmployee?.salary} Baht"
    }
    fun onClickBack(v: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}