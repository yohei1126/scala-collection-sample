package example.rna

import org.scalatest._

class BaseSpec extends FlatSpec with Matchers {
  it should "map between bases to an array" in {
    Base.fromInt shouldEqual Array(A, T, G, U)
  }

  it should "map between bases to a map" in {
    Base.toInt shouldEqual Map(A -> 0, T -> 1, G -> 2, U -> 3)
  }
}
