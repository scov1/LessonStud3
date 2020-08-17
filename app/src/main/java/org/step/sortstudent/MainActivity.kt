package org.step.sortstudent

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    lateinit var showStudents: TextView
    lateinit var sortStudents : Button
    lateinit var randomStudents : Button
    lateinit var layoutStudents: LinearLayout
    lateinit var listStud: Student


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showStudents = findViewById(R.id.listStudents)
        sortStudents = findViewById(R.id.sortStudents)
        randomStudents = findViewById(R.id.randomStudents)
        layoutStudents = findViewById(R.id.layout_students_list)
        listStud = Student()

        showListStudents()

        sortStudents.setOnClickListener{
            listStud.sortStudent()
            showListStudents()
        }

        randomStudents.setOnClickListener{
            listStud.randomStudent()
            showListStudents()
        }
    }

    fun showListStudents(){

        layoutStudents.removeAllViews()

        listStud.getStudents().forEach {
            showStudents= TextView(getApplicationContext())
            showStudents.setText(it)
            showStudents.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
            layoutStudents.addView(showStudents)

        }
    }
}