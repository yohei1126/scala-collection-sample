package example.rna

import org.scalatest._

class RNA1Spec extends FlatSpec with Matchers {
  it should "map between bases to an array" in {
    val xs = List(A, G, T, A)
    RNA1.fromSeq(xs) shouldEqual RNA1(A, G, T, A)
  }
}
