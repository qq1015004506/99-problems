package com.shekhargulati.ninetynine_problems.scala.lists

/**
  * (*) Remove the K'th element from a list
  */
object P20 {

  /*
  Using built in take drop
   */
  def removeAt[T](list: List[T], k: Int): (List[T], T) = (list.take(k - 1) ++ list.drop(k), list(k - 1))

  /*
  Using splitAt
   */
  def removeAt_splitAt[T](list: List[T], k: Int): (List[T], T) = {
    val (first, second) = list.splitAt(k)
    (first.init ++ second, first.last)
  }
}
