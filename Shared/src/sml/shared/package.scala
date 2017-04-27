package sml

/**
  * Created by brandon on 17/04/26.
  */
package object shared {
  type XY = (Double, Double)
  type XYTSeries = Array[(Double, Double)]
  type DMatrix[T] = Array[Array[T]]
  type DVector[T] = Array[T]
  type DblMatrix = DMatrix[Double]
  type DblVector = DVector[Double]

  implicit def int2Double(n: Int): Double = n.toDouble
  implicit def vectorT2DblVector[T <% Double](vt: DVector[T]): DblVector =
    vt.map( t => t.toDouble)
  implicit def double2DblVector(x: Double): DblVector = Array[Double](x)
  implicit def dblPair2DbLVector(x: (Double, Double)): DblVector =
    Array[Double](x._1,x._2)
  implicit def dblPairs2DblRows(x: (Double, Double)): DblMatrix =
    Array[Array[Double]](Array[Double](x._1, x._2))
}
