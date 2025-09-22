package com.unsoed.informatikamobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.unsoed.informatikamobile.databinding.ActivityHalaman2Binding

class Halaman2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityHalaman2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalaman2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Atur menu satu-satu, passing the .root view of each included layout
        setMenu(binding.layoutPhone.root, R.drawable.ic_phone, getString(R.string.telepon))
        setMenu(binding.layoutEmail.root, R.drawable.ic_email, getString(R.string.email))
        setMenu(binding.layoutLocation.root, R.drawable.ic_location, getString(R.string.alamat))
        setMenu(binding.layoutIg.root, R.drawable.ic_himpunan, getString(R.string.himpunan))


        // Tombol back
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    // Fungsi helper untuk mengisi icon + text pada layout_menu
    private fun setMenu(layout: android.view.View, iconRes: Int, text: String) {
        val icon = layout.findViewById<ImageView>(R.id.img_icon)
        val tv = layout.findViewById<TextView>(R.id.tv_layout)
        icon.setImageResource(iconRes)
        tv.text = text
    }
}
