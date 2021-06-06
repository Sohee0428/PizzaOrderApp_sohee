package com.example.pizzaorderapp_sohee.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.pizzaorderapp_sohee.R
import com.example.pizzaorderapp_sohee.datas.Store

class PizzaStoreAdapter(val mContext: Context, val resId: Int, val mList: List<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        val row = tempRow?: inflater.inflate(resId, null)

        val data = mList[position]

        val storeNameTxt = row.findViewById<TextView>(R.id.storeNameTxt)
        val logoImg = row.findViewById<ImageView>(R.id.logoImg)

        storeNameTxt.text = data.name

        Glide.with(mContext)
                .load(R.drawable.ic_launcher_background)
                .into(logoImg)
        return row
    }
}
