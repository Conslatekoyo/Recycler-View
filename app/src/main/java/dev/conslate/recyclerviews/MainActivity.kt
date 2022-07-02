package dev.conslate.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.conslate.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNames()
    }
    fun displayNames(){
        var namesList= listOf("kayitete","Susan","Brenda","joyce","Conslate")
        var namesAdapter= NamesRecyclerViewAdapter(namesList)
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        binding.rvNames.adapter=namesAdapter
    }
}