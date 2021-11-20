package com.example.listview_20211120

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.listview_20211120.adapters.StudentAdapter
import com.example.listview_20211120.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    lateinit var mStudentAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(StudentData("조경진", 1988, "서울시 동대문구") )
        mStudentList.add(StudentData("구영모", 1990, "경기도 부천시") )
        mStudentList.add(StudentData("김정난", 1976, "서울시 용산구") )
        mStudentList.add(StudentData("김정환", 1996, "서울시 성북구") )
        mStudentList.add(StudentData("김창배", 1993, "서울시 노원구") )
        mStudentList.add(StudentData("성연진", 1994, "서울시 성동구") )
        mStudentList.add(StudentData("윤성노", 1974, "서울시 중랑구") )
        mStudentList.add(StudentData("최연주", 1985, "서울시 성북구") )

        mStudentAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mStudentAdapter

        studentListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedStudent = mStudentList[position]
            Toast.makeText(this, "${clickedStudent.name} 클릭됨", Toast.LENGTH_SHORT).show()
        }
    }
}