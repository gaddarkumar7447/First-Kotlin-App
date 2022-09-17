package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityBindingClassBinding

class BindingClass : AppCompatActivity() {

    private lateinit var bindingClass : ActivityBindingClassBinding

    /*private lateinit var viewModel : BindingModelClass*/

    private lateinit var viewClass: ModelViewClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = DataBindingUtil.setContentView(this, R.layout.activity_binding_class)

        viewClass = ViewModelProvider(this).get(ModelViewClass ::class.java)

        bindingClass.showText.text = viewClass.current.toString()
        bindingClass.increment.setOnClickListener(View.OnClickListener {
            bindingClass.showText.text = viewClass.increment.toString()
        })


        /*viewModel = ViewModelProvider(this).get(BindingModelClass::class.java)
        bindingClass.showText.text = viewModel.getCurrentCount().toString()
        bindingClass.increment.setOnClickListener(View.OnClickListener {
            bindingClass.showText.text = viewModel.updateCount().toString()

        })*/



        /*bindingClass.buttonSubmit.setOnClickListener(View.OnClickListener {
            showData()
        })
        var a = 0;
        bindingClass.increment.setOnClickListener(View.OnClickListener {
            a++
            bindingClass.showText.text = a.toString()
        })*/
    }

    /*private fun showData(){
        bindingClass.textView.text = bindingClass.editText.text.toString().trim()
    }*/


}