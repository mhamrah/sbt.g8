package $project_group_id$.$name;format="norm,word"$

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.rdd._


object Main {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("$name;format="Camel"$")
    val sc = new SparkContext(conf)

    val data = sc.textFile("/Users/mhamrah/sample.txt")

   // run(data)

    sc.stop
  }

  def run(input: RDD[String]) = {
    val lines = input.map(l => l.split('\t'))

    lines.count

  }

}
