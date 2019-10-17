package ch02

object Demo {

  def memo1(x: Int): Int = {
    var r = 1
    if (x > 5) r = x * 5
    r
  }

  def memo1(n: Int*): Int = {
    var r: Int = 0
    for (x <- n) r -= x * 5
    r
  }

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg * 5
    result
  }

  def main(args: Array[String]): Unit = {
    val x = 5
    var n: Int = 5
    if (x > 1) 0 else 1
    val y = if (x > 1) 0 else false

    if (n > 1) { val r: Int = x * n; print(r) }

    for (n <- 1 to x)
      println(x * n)

    for (i <- 1 to 5; j <- 2 to 10 if (i == j)) {
      println(i * j + 2)
    }

    val aa = for (i <- 1 to 5; j <- 2 to 10 if (i == j)) yield i * j + 2
    println(aa, aa(1))

    println(memo1(10))

    val bb = aa.apply(3)
    println(bb)

    println("sum:" + sum(1, 2, 3, 4, 5, 6, 7, 8, 9))

    println("sum:" + sum(1 to 100: _*))

    println(0 until 10)

    print(Array(1, 4, 2, 3, 8, 7, 9, 5, 0).sortWith((x, y) => x > y).mkString)

  }
}