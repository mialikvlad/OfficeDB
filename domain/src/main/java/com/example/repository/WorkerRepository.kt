package com.example.repository

import com.example.domain.Worker

interface WorkerRepository {

    fun addWorker(worker: Worker): List<Worker>

    fun deleteWorker(worker: Worker): List<Worker>
}