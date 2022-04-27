package com.example.data.repository

import com.example.domain.Worker
import com.example.repository.WorkerRepository

class WorkerRepositoryImpl : WorkerRepository {
    private val mutableListWorker = mutableListOf<Worker>()
    override fun addWorker(worker: Worker): List<Worker> {
        mutableListWorker.add(worker)
        return mutableListWorker
    }

    override fun deleteWorker(worker: Worker): List<Worker> {
        if(mutableListWorker.isNotEmpty()){
            mutableListWorker.remove(worker)
        }
        return mutableListWorker
    }
}