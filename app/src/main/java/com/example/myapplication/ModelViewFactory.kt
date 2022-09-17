package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityModelViewFactoryBinding
import java.util.*

class ModelViewFactory : AppCompatActivity() {

    private lateinit var binding : ActivityModelViewFactoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_model_view_factory)

        //val random = (10 .. 1000).random()
        binding.rendomDataShow.text = "90"
        binding.dataEdit.text

        binding.buttonFactory.setOnClickListener(View.OnClickListener {
            binding.rendomDataShow.text =
                (binding.dataEdit.text.toString().toInt() + 90).toString()
        })

    }
}