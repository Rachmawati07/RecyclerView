package com.rachma.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.rachma.affirmations.adapter.ItemAdapter
import com.rachma.affirmations.data.Datasource

// TODO 6 : Merupakan proses untuk menampilkan data ke RecyclerView
// Untuk mendeklarasikan class yang bernama MainActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Untuk menginisialisasi data untuk ditampilkan
        val myDataset = Datasource().loadAffirmations()

        // Untuk menemukan referensi ke RecyclerView dalam tata letak
        // Untuk memberi tahu recyclerView agar menggunakan dan menjalankan class ItemAdapter yang dibuat
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Untuk meningkatkan performa jika mengetahui bahwa perubahan dalam isi tidak mengubah ukuran tata letak
        recyclerView.setHasFixedSize(true)
    }
}