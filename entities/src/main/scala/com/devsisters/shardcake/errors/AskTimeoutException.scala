package com.devsisters.shardcake.errors

import com.devsisters.shardcake.EntityType

/**
 * Exception indicating than an ask didn't receive any response within the configured timeout.
 */
case class AskTimeoutException[A](entityType: EntityType[A], entityId: String, body: A) extends Exception {
  override def getMessage: String = s"Timeout sending message to ${entityType.value} $entityId - $body"
}
