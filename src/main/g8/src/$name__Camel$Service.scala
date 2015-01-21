package $project_group_id$.$name;format="norm,word"$

import akka.actor.{Actor, ActorSystem, Props, ActorLogging}
import spray.routing._



class $name;format="Camel"$Actor extends Actor with $name;format="Camel"$Service with ActorLogging {
  def actorRefFactory = context
  def receive = runRoute($name;format="camel"$Route)
}

trait $name;format="Camel"$Service extends HttpService {
  implicit def executionContext = actorRefFactory.dispatcher

  val $name;format="camel"$Route = {
    path("entity") {
      get {
        complete("list")
      } ~
      post {
        complete("create")
      } ~
      path ("entity" / Segment) { id =>
        get {
          complete("detail")
        } ~
        post {
          complete("update")
        }
      }
    }
  }
}

