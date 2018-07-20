package week4

class Nil[T] extends List[T]{

  def isEmpty: Boolean = true

  def head = throw new NoSuchElementException("Nil.head")

  def tail = throw new NoSuchElementException("Nil.tail")

}
