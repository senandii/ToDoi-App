package com.example.ToDoi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ToDoi.databinding.TaskItemCellBinding

class TaskItemAdapter(
    private val taskItems: List<TaskItem>,
    private val clickListener: TaskItemClickListener
): RecyclerView.Adapter<TaskItemViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskItemViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = TaskItemCellBinding.inflate(from, parent, false)
        return TaskItemViewHolder(parent.context, binding, clickListener)
    }

    override fun onBindViewHolder(holder: TaskItemViewHolder, position: Int) {
        holder.bindTaskItem(taskItems[position])

        holder.itemView.setOnLongClickListener {
            clickListener.deleteTaskItem(taskItems[position])
            true // Return true to consume the long click event
        }

    }

    override fun getItemCount(): Int = taskItems.size



}


