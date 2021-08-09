package com.myweb.ass5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import com.myweb.ass5intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun showResult(view : View){

        var  radioGroup: RadioGroup =  findViewById(R.id.radioGroup)
        var  selectedId : Int = radioGroup.checkedRadioButtonId
        var  radioButton : RadioButton = findViewById(selectedId)


        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("empData", Employee(binding.editName.text.toString(),radioButton.text.toString(),
            binding.editEmail.text.toString(), binding.editSalary.text.toString().toInt()))
        startActivity(intent)

    }


    fun resetData(v: View){
        binding.editName.text.clear()
        //edit_password.text.clear()
        binding.editEmail.text.clear()
        binding.editSalary.text.clear()
        var  radioGroup: RadioGroup =  findViewById(R.id.radioGroup)
        radioGroup.clearCheck()

    }
}