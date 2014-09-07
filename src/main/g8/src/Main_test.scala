package $project_group_id$.$name;format="norm,word"$

import org.scalatest._
import org.scalatest.matchers._

class MainSpec
  extends FreeSpec
  with Matchers
  with SparkContextAware {
  "The Main class" - {
    "should run a Spark job" in {
      val sample = resourceFile("/sample.txt")
    
      val result = Main.run(sample)
      result shouldBe 1
      
    }
  }
}


