package com.example.tekrar_30nisan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.tekrar_30nisan.databinding.ItemClothesBinding

class ClothesAdapter(val list: List<ClothesModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val clothesBinding = DataBindingUtil.inflate<ViewDataBinding>(
                LayoutInflater.from(parent.context), R.layout.item_clothes, parent, false
            )
            return DataViewHolder(clothesBinding)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            (holder as DataViewHolder).onBind(list.get(position))
        }

        override fun getItemCount(): Int {
            return list.size
        }

        class DataViewHolder(val clothesBinding: ViewDataBinding) :
            RecyclerView.ViewHolder(clothesBinding.root) {

            fun onBind(dataModel: ClothesModel) {
                val binding = clothesBinding as ItemClothesBinding
                binding.setVariable(BR.item_programs, dataModel)
            }

        }
    }