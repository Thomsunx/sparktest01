import org.apache.spark.{SparkConf, SparkContext}

object Hello {
  def main(args: Array[String]): Unit = {
    //System.setProperty("hadoop.home.dir", "E:\\Hadoop\\hadoop-common-2.2.0-bin-master")
    val config = new SparkConf().setMaster("local[*]").setAppName("WordCount")
    val sc = new SparkContext(config)
    val lines = sc.textFile("G:\\flinkDemo\\distributedcache.txt")
    val words = lines.flatMap(_.split(" "))
    val wordToOne = words.map((_, 1))
    val wordToSum = wordToOne.reduceByKey(_ + _)
    val result = wordToSum.collect()
    result.foreach(println)

    //第一种方法
  }
}
