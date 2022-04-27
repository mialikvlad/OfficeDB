package com.example.usecase

import com.example.domain.Worker
import com.example.repository.WorkerRepository

class DeleteWorkerUseCase(private val workerRepository: WorkerRepository) {

    operator fun invoke(worker: Worker): List<Worker>{
        return workerRepository.deleteWorker(worker)
    }
}