package com.example.advancedlight.lollipop

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.advancedlight.databinding.RvTestItemBinding

class RvTestAdapter(private val context: Context, private val strings: ArrayList<String>): RecyclerView.Adapter<RvTestViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvTestViewHolder {
        return RvTestViewHolder(RvTestItemBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    @SuppressLint("RecyclerView")
    override fun onBindViewHolder(holder: RvTestViewHolder,  position: Int) {
        holder.binding.tvItem.text = strings[position]
        holder.itemView.setOnClickListener{
            Toast.makeText(context, "当前是第" + position + "项", Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnLongClickListener {
            AlertDialog.Builder(context)
                .setTitle("确认删除吗？")
                .setNegativeButton("取消", null)
                .setPositiveButton("确定"
                ) { _, _ ->
                    notifyItemRemoved(position)
                }.show()
            true
        }
    }

    override fun getItemCount(): Int {
        return strings.size
    }
}

class RvTestViewHolder(val binding: RvTestItemBinding): RecyclerView.ViewHolder(binding.root)
