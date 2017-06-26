import org.scalatest._

class FailingTests extends FlatSpec {
  "failing test" should "fail" in {
    assert(true)
  }
}
