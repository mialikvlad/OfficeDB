package com.example.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.domain.Worker
import com.example.presentation.databinding.ItemWorkerBinding

class WorkerViewHolder(
    private val binding: ItemWorkerBinding,
    private val onWorkerClicked: (Worker) -> Unit
) : RecyclerView.ViewHolder(binding.root){
    fun bind(worker: Worker){
        with(binding){
            firstName.text = worker.firstName
            secondName.text = worker.secondName
            workerJob.text = worker.job

            root.setOnClickListener {
                onWorkerClicked(worker)
            }
        }
    }
}