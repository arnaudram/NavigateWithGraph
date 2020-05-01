package com.example.navigatewithgraph

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class ManageWork(context: Context, workerParams: WorkerParameters) :Worker(context, workerParams) {
    override fun doWork(): Result {

        return try {
            Result.success()
        } catch (e: Exception) {
            Result.retry()
        }
    }
}