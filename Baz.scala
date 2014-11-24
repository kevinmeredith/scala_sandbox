object Baz {
	case class Foo(x: Int)
	case class Bar(x: Int, y: Int) extends Foo(x)
}

 