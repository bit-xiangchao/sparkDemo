package SparkDemo.sparkdemo.java;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.hive.HiveContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        SparkConf conf = new SparkConf().setAppName(
//				"MainWash");
//        JavaSparkContext sc=new JavaSparkContext(conf);
//        HiveContext hiveContext=new  HiveContext(sc);
//        hiveContext.sql("use test");
//        Row[] rows=hiveContext.sql("show tables").collect();
//       for (Row row : rows) {
//		System.out.println(row);
//	}
    	stringClear(" bb A级c 1 级 2");
    }
    public static void  stringClear(String maitainLevel){
    	if(maitainLevel.contains("A")){
			maitainLevel=maitainLevel.replace(" ", "");
			maitainLevel=maitainLevel.replace("级","");
		}
    	System.out.println(maitainLevel);
    }
}
