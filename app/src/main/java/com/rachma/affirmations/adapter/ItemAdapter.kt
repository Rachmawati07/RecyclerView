package com.rachma.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rachma.affirmations.R
import com.rachma.affirmations.model.Affirmation

// TODO 4 : Untuk mendeklarasikan class yang bernama ItemAdapter.
// Mendeklarasikan val content dan dataset sebagai private
// Untuk menampilkan objek data affirmasi
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // TODO 5 : Untuk mendeklarasikan class View Holder yang digunakan untuk menampilkan data per item view component
    // Untuk menyimpan referensi ke setiap tampilan dalam tata letak item daftar dengan nama viewholder
    // Untuk memberikan akses ke semua tampilan untuk item data dalam viewholder
    // Pada setiap item data merupakan objek afirmasi
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        // Untuk menghubungkan data ke id view component dari setiap item data
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    // Membuat views baru yang dipanggil oleh layout manager
    // Menghubungkan ke layout per item data
    // Untuk mengambil dua parameter dan menampilkan ViewHolder baru.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    // Metode BindViewHolder() akan dipanggil oleh pengelola tata letak untuk mengganti isi tampilan item daftar.
    // Untuk menempelkan setiap data ke setiap tampilan (item list)
    // Untuk mengganti isi dari view yang dipanggil oleh layout manager
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    // Untuk menghitung banyaknya data yang akan ditampilkan
    // Untuk mengembalikan ukuran data set yang dipanggil oleh layout manager
    override fun getItemCount() = dataset.size
}
