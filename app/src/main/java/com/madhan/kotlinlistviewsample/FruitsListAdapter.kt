package com.madhan.kotlinlistviewsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by madhan on 01/03/18.
 */
open class FruitsListAdapter(data: ArrayList<Fruits>, context: Context) : BaseAdapter() {
    private val mInflater: LayoutInflater = LayoutInflater.from(context)
    private var localData = data

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val view:View?
        val viewHolder: ViewHolder
        if(convertView ==  null) {
            view = mInflater.inflate(R.layout.list_item, parent,false)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        viewHolder.label.text = localData.get(index = position).toString()
        return view
    }


    override fun getItem(position: Int): Any {
        return localData[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return localData.size
    }

    private class ViewHolder(row: View?) {
        val label: TextView = row?.findViewById(R.id.label) as TextView
    }
}