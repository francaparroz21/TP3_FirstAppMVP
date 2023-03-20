package com.example.pil_hello_world.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pil_hello_world.databinding.ActivityMainBinding
import com.example.pil_hello_world.mvp.contract.MainContract
import com.example.pil_hello_world.mvp.presenter.MainPresenter
import com.example.pil_hello_world.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: MainContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MainPresenter(MainView(this))
        binding.buttonShowText.setOnClickListener {
            presenter.onClickButtonShow(binding.insertText.text.toString())
        }
    }
}
