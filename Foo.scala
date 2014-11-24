object Foo {
	def unapply(f: Foo): Option[Int] = Some(f.x)
}

class Foo(val x: Int) 