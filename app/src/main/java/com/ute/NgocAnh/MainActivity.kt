package com.ute.NgocAnh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ute.NgocAnh.databinding.ActivityMainBinding
import com.ute.NgocAnh.Model.Student
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val defaultStudent = Student(
        id = "2415053122202",
        name = "Huỳnh Ngọc Anh",
        className = "24T2",
        age = "20",
        email = "2415053122202@ute.udn.vn",
        gpa = 3.8
    )
    private var currentStudent = defaultStudent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }

}