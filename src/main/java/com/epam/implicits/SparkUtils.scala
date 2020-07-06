package com.epam.implicits

/**
 * @author Evgeny Borisov
 */
object SparkUtils {

  implicit def dataframeToDataset(dataframe: Dataframe):Dataset=new Dataset

  def filter(dataset: Dataset):Unit={}

}



class Dataframe{}
class Dataset{}