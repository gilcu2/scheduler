package com.workday.techtest

/**
 * Defines a piece of work to be executed on behalf of a customer
 */
trait Job {
  // Uniquely identifies the customer associated with this job
  val customerId: Long
  // Uniquely identifies the job. 2 jobs with the same
  // uniqueId should behave identically when executed
  val uniqueId: Long
  // Estimated time in milliseconds that the job will take to execute
  val duration: Int
  // Execute the job
  def execute(): Unit
}
