import io.delta.tables._
object DeltaTable {
  val deltaTable = DeltaTable.convertToDelta(spark, "parquet.`s3a://databricks-balatpka/insurance_table/`")

  //for reading the data from delta
  val checkDf = spark.read.format("delta").load("s3a://databricks-balatpka/insurance_table/")

  spark.read.option("header","true").option("inferSchema", "true")
    .csv("s3a://fl-insurance/FL_insurance_sample.csv").limit(10)
    .write.format("delta").mode("append").save("s3a://databricks-balatpka/insurance_table/")

  import io.delta.tables._
  val deltaTable = DeltaTable.forPath(spark, "s3a://databricks-balatpka/insurance_table/")
  deltaTable.updateExpr(
    "construction = 'Masonry' and statecode = 'CALIFORNIA'",
    Map("construction" -> "'tpka'")
  )

  // to know about versions
  deltaTable.history().show(false)



  //spark.read.parquet("s3a://databricks-balatpka/insurance_table/_delta_log/00000000000000000000.checkpoint.parquet")
  // .coalesce(1).rdd.saveAsTextFile("s3a://tpka-pyscho/log-file")
}