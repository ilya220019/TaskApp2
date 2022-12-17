package com.example.taskapp2.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp2.databinding.TascItemBinding
class taskAdapter : RecyclerView.Adapter<taskAdapter.ViewHolder>() {
    private var taskList = arrayListOf<task_model>()
    fun addTask(taskModel: task_model){
        taskList.add(0,taskModel)
        notifyItemChanged(0)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TascItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(taskList[position])
    }

    override fun getItemCount(): Int = taskList.size


    inner class ViewHolder(private var binding: TascItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(taskModel: task_model) {
            binding.tvTitle.text = taskModel.title
            binding.tvDesc.text = taskModel.description

    }    }

}