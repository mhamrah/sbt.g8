package $project_group_id$.$name;format="norm,word"$

import akka.actor.{Actor, ActorSystem, Props, ActorLogging}
import akka.actor.ActorDSL._
import akka.io.IO
import spray.can.Http
import spray.routing._
import spray.util._
import akka.io.Tcp._

object Main extends App {
  implicit val system = ActorSystem("$name;format="lower"$-system")

  /* Spray Service */
  val service= system.actorOf(Props[$name;format="Camel"$Actor], "$name;format="lower"$-service")

  val ioListener = actor("ioListener")(new Act with ActorLogging {
    become {
      case b @ Bound(connection) => log.info(b.toString)
    }
  })


  IO(Http).tell(Http.Bind(service, Config.HttpConfig.interface, Config.HttpConfig.port), ioListener)

}
