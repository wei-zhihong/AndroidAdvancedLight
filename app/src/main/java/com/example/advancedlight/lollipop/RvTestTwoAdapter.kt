package com.example.advancedlight.lollipop

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.advancedlight.databinding.RvTestTwoItemBinding

class RvTestTwoAdapter(
    private val context: Context,
    private val strings: ArrayList<String>,
    private val heights: ArrayList<Int>
): RecyclerView.Adapter<RvTestTwoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvTestTwoViewHolder {
        return RvTestTwoViewHolder(RvTestTwoItemBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    @SuppressLint("RecyclerView")
    override fun onBindViewHolder(holder: RvTestTwoViewHolder,  position: Int) {
        holder.binding.tvItem.text = strings[position]
        val layoutParams = holder.binding.tvItem.layoutParams
        layoutParams.height = heights[position]
        holder.binding.tvItem.layoutParams = layoutParams
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

class RvTestTwoViewHolder(val binding: RvTestTwoItemBinding): RecyclerView.ViewHolder(binding.root)
