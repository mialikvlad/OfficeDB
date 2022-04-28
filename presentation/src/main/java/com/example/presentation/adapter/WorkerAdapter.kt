package com.example.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.Worker
import com.example.presentation.databinding.ItemWorkerBinding

class WorkerAdapter(
    private val onWorkerClicked: (Worker) -> Unit
) : RecyclerView.Adapter<WorkerViewHolder>(){

    private val workerList = mutableListOf<Worker>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkerViewHolder {
        return WorkerViewHolder(
            binding = ItemWorkerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onWorkerClicked = onWorkerClicked
        )
    }

    override fun onBindViewHolder(holder: WorkerViewHolder, position: Int) {
        holder.bind(workerList[position])
    }

    override fun getItemCount(): Int {
        return workerList.size
    }
}