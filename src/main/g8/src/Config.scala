package $project_group_id$.$name;format="norm,word"$

import com.typesafe.config.ConfigFactory

object Config {
  private val config = ConfigFactory.load()

  object HttpConfig {
    private val httpConfig = config.getConfig("http")
    lazy val interface = httpConfig.getString("interface")
    lazy val port = httpConfig.getInt("port")
  }
  //Config Settings
}
