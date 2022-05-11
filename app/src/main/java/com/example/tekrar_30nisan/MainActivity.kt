package com.example.tekrar_30nisan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tekrar_30nisan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val list = ArrayList<ClothesModel>()
        list.add(ClothesModel("2022 Get Toned Challenge", "28 days", "30-40 min/day", "Released: March 2022", R.drawable.program1))
        list.add(ClothesModel("2022 Weight Loss Challenge", "28 days", "30 min/day", "Release date: Jan 2022", R.drawable.program2))
        list.add(ClothesModel("2021 MOVEmber", "45 days", "30 min/day", "Release date: Nov 2021", R.drawable.program3))
        list.add(ClothesModel("2021 FITober", "22 days", "30 min/day", "Released: Oct 2021", R.drawable.program4))
        list.add(ClothesModel("2021 2 Weeks Shred Challenge", "14 days", "30 min/day", "Released: August 2021", R.drawable.program5))
        list.add(ClothesModel("2021 Get Fit Challenge", "21 days", "30 min/day", "Released: Jun 2021", R.drawable.program6))
        list.add(ClothesModel("2021 Summer Shred Challenge", "28 days", "30 min/day", "Released: May 2021", R.drawable.program7))
        list.add(ClothesModel("2021 Weight Loss Challenge", "21 days", "30-40 min/day", "Released: March 2021", R.drawable.program8))
        list.add(ClothesModel("2021 Hourglass Challenge", "21 days", "30-40 min/day", "Released: February 2021", R.drawable.program9))
        list.add(ClothesModel("2021 Flat Stomach Challenge", "28 days", "20-43 min/day", "Release date: Jan 2021", R.drawable.program10))
        list.add(ClothesModel("2020 Get Peachy Challenge", "28 days", "30-40 min/day", "Release date: Oct 2020", R.drawable.program11))
        list.add(ClothesModel("2020 2 Weeks Shred Challenge", "14 days", "30-65 min/day", "Release date: Aug 2020", R.drawable.program12))

        val adapter = ClothesAdapter(list)
        val gridLayoutManager = GridLayoutManager(this, 1)
        activityMainBinding.recyclerView.layoutManager = gridLayoutManager
        activityMainBinding.setVariable(BR.adapter, adapter)
    }
}