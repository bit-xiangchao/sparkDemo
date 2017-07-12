package SparkDemo.sparkdemo.scala

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object App {
  def main(args: Array[String]): Unit = {
    val conf =new SparkConf().setAppName("wordcount").setMaster("local")
    val sc =new SparkContext(conf)
    val line =sc.textFile("words.txt")
//    line.flatMap { _.split(" ") }.map { (_,1) }.reduceByKey(_+_).collect().foreach(println)
    val words=line.flatMap { _.split(" ") }.filter { word =>word !=" " }
    val paris=words.map { word => (word,1) }
    val wordcount=paris.reduceByKey((v1,v2)=>v1+v2)
//    wordcount.collect().foreach(println)
    
    //测试scala行动操作和转化操作
val list=sc.parallelize(List(1,2,3), 1)
list.map { x => x+1 }.collect().foreach { println }

//val mapT=sc.parallelize(List((1,2),(2,3),(2,4)), 1)

//mapT.reduceByKey((x,y)=>x+y).collect().foreach(println)
//
//mapT.mapValues { x => x+1 }.collect().foreach(println)

    
 
  }
}