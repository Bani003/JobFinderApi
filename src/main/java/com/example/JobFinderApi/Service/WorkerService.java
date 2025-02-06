package com.example.JobFinderApi.Service;

import com.example.JobFinderApi.Pojo.Entity.User;
import com.example.JobFinderApi.Pojo.Entity.Worker;
import com.example.JobFinderApi.Pojo.Input.UserInput;
import com.example.JobFinderApi.Pojo.Input.WorkInput;
import com.example.JobFinderApi.Pojo.Input.WorkerInput;

public interface WorkerService {
    Worker createWorker(WorkerInput workerInput);
    Worker updateWorker(WorkerInput workerInput,int worker_id);

}
