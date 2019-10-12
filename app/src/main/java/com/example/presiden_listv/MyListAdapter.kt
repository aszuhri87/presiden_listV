package com.example.presiden_listv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.lv_icon.Model

class MyListAdapter(var mCtx:Context , var resource:Int,var items:List<Model>)
    :ArrayAdapter<Model>( mCtx , resource , items ){




    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater :LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        val imageView :ImageView = view.findViewById(R.id.icon)
        var textView : TextView = view.findViewById(R.id.judule)
        var textView1 : TextView = view.findViewById(R.id.keterangan)


        var langpro : Model = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(langpro.gambar))
        textView.text = langpro.judul
        textView1.text = langpro.ket


        return view
    }

}