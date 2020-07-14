package com.workday.techtest

/**
 * Provides Jobs to execute
 */
trait JobQueue {
  // Remove a job from the queue. If the queue has been drained,
  // this call will block until a new job becomes available
  def pop(): Job
}