package com.example.usecase

import com.example.domain.Worker
import com.example.repository.WorkerRepository

class AddWorkerUseCase(private val workerRepository: WorkerRepository) {

    operator fun invoke(worker: Worker): List<Worker>{
        return workerRepository.addWorker(worker)
    }
}