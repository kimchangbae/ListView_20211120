package com.example.listview_20211120.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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

        val row = tempRow!!

        return row
    }
}