package com.workday.techtest

trait JobRunner {
  def runner(jobQueue: JobQueue, jobCount: Long): Unit
  val version: String
}
