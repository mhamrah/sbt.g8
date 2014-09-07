package $project_group_id$.$name;format="norm,word"$

import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest.{BeforeAndAfterEach, Suite}
import org.apache.spark.rdd._
import scala.io.Source

trait SparkContextAware extends BeforeAndAfterEach {

  this: Suite =>

  private val configuration = new SparkConf().setAppName("test").setMaster("local")
  protected var sc: SparkContext = null

  override protected def beforeEach(): Unit = {
    sc = new SparkContext(configuration)
  }

  override protected def afterEach(): Unit = {
    sc.stop()
  }

  protected def textFile(inputFilePath: String) = {
    sc.textFile(inputFilePath)
  }

  protected def resourceFile(resourcePath: String): RDD[String] = {
    val source = Source.fromURL(getClass.getResource(resourcePath))
    sc.parallelize(source.getLines().toSeq)
  }

}
