/**
 * Copyright (C) 2014 Typesafe Inc. <http://www.typesafe.com>
 */
package akka.stream

import org.scalatest.testng.TestNGSuiteLike
// FIXME: Needs new TCK version
// import org.reactivestreams.tck.{ TestEnvironment, PublisherVerification }
import akka.stream.scaladsl.Flow
import akka.actor.ActorSystem
import akka.stream.testkit.AkkaSpec

class IteratorProducerTest(_system: ActorSystem, /*env: TestEnvironment, */ publisherShutdownTimeout: Long) {
  // FIXME: Needs new TCK version
  // Original code available in 82734877d080577cf538c2a47d60c117e078ac1c
}