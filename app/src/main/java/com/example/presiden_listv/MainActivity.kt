package com.example.presiden_listv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import android.app.Dialog;

import android.widget.TextView
import com.example.lv_icon.Model


class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        var list = mutableListOf<Model>()

        val dialog = Dialog(this@MainActivity)
        dialog.setContentView(R.layout.dialogcustom)

        dialog.setTitle("Deskripsi")


        list.add(Model("Ir. Soekarno",   "Presiden ke-1",   R.drawable.pres_1))
        list.add(Model("Soeharto",   "Presiden ke-2",   R.drawable.pres_2))
        list.add(Model("Bacharuddin Jusuf Habibie", "Presiden ke-3", R.drawable.pres_3 ))
        list.add(Model("Abdurrahman Wahid",  "Presiden ke-4",  R.drawable.pres_4  ))
        list.add(Model("Megawati Soekarnoputri",  "Presiden ke-5",  R.drawable.pres_5))
        list.add(Model("Susilo Bambang Yudhoyono",  "Presiden ke-6",  R.drawable.pres_6))
        list.add(Model("Joko Widodo",  "Presiden ke-7",  R.drawable.pres_7))

        listView.adapter = MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "Presiden pertama Republik Indonesia, " +
                        "Soekarno yang biasa dipanggil Bung Karno, lahir di Blitar, Jawa Timur," +
                        " 6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970. "
                dialog.show()

            }
            if (position==1){

                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "Soeharto adalah Presiden kedua Republik Indonesia. " +
                        "Beliau lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921. "
                dialog.show()

            }
            if (position==2){

                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "Presiden ketiga Republik Indonesia, " +
                        "Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936."
                dialog.show()

            }
            if (position==3){

                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "Gus Dur adalah putra pertama dari enam bersaudara yang dilahirkan " +
                        "di Denanyar Jombang Jawa Timur pada tanggal 4 Agustus 1940."
                dialog.show()

            }
            if (position==4){

                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "Presiden Republik Indonesia ke-5, Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947. " +
                        "Sebelum diangkat sebagai presiden," +
                        " beliau adalah Wakil Presiden RI yang ke-8 dibawah pemerintahan Abdurrahman Wahid."
                dialog.show()

            }
            if (position==5){
                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "Susilo Bambang Yudhoyono adalah presiden RI ke-6. Berbeda dengan presiden sebelumnya, " +
                        "beliau merupakan presiden pertama yang dipilih secara langsung oleh rakyat dalam proses " +
                        "Pemilu Presiden putaran II 20 September 2004. "
                dialog.show()
            }
            if (position==6){
                val text = dialog.findViewById(R.id.tv_desc) as TextView
                text.text = "Jokowi lahir dengan nama lengkap Joko Widodo. Ia lahir di Surakarta, 21 Juni 1961. " +
                        "Ia merupakan Putera dari pasangan Noto Mihardjo dan Sudhiatmi dan anak sulung dari empat bersaudara."
                dialog.show()
            }
        }


    }
}

