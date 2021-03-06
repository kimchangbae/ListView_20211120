package com.example.listview_20211120.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listview_20211120.R
import com.example.listview_20211120.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext,resId,mList) {

    // Adapter의 역할 : xml + 데이터 클래스 자료 조합.

    // xml 파일을 이 Adapter 코드에서 끌어다 사용하게 도와줌
    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.student_list_item, null)
        }

        // xml -> row변수에 담아두자.
        val row = tempRow!!

        // row를 실제 데이터로 가공해주고 근거 데이터를 가져오자.
        val data = mList[position]

        // 뿌려질 UI들을 가져오자. row 내부에서 찾아오자
        val txtStudentName      = row.findViewById<TextView>(R.id.txtStudentName)
        val txtStudentAge       = row.findViewById<TextView>(R.id.txtStudentAge)
        val txtStudentAddress   = row.findViewById<TextView>(R.id.txtStudentAddress)

        // UI의 데이터에서 필요한 변수 추출 반영
        txtStudentName.text = data.name

        //val age = 2021 - data.birthYear + 1
        txtStudentAge.text = "(${data.getAgeByYear(2021)} 세)"

        txtStudentAddress.text = data.address

        // row에 담긴 xml을 화면에 뿌려주게 내보내자.
        return row
    }
}