package week4

object Example extends App{

  def nth[T](n: Int, tList: List[T]) = {
    var i = -1
    def iter[T](iList: List[T]): T = {
      i = i+1
      if(iList.isEmpty) throw new IndexOutOfBoundsException("Out Of Elements")
      else if(i == n) iList.head
      else iter[T](iList.tail)
    }
    iter(tList)
  }

  val third = new Cons[Int](3, new Nil)
  val second = new Cons[Int](2, third)
  val first = new Cons[Int](1, second)
  val zero = new Cons[Int](0, first)

  println(nth(-1, zero))


}
