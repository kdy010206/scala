import scala.util.Random
class Point {

}

object TraitsTest {
  def main(args: Array[String]) {
    val i = 1
    val two = 1 + 1
    println(two)

    def f(x: Int) = {
      x * x
    }

    println(f(5))

    def three() = 1 + 2

    println(three())
    val addOne = (x: Int) => x + 1
    println(addOne(4))

    def adder(m: Int, n: Int) = m + n

    println(adder(4, 2))
    val add2 = adder(2, _: Int)
    println(add2(6))

    def multiply(m: Int)(n: Int): Int = m * n

    println(multiply(2)(i))
    println(multiply(2)(3))
    val timesTwo = multiply(2) _
    println(timesTwo(3))

    def capitalizeAll(args: String*) = {
      args.map { arg => arg.capitalize
      }
    }
    println(capitalizeAll("rat", "apll"))
  }
}

object HelloWorld {
  def main(args: Array[String]) {
    for (i <- List.range(2, 10)) {
      for (j <- List.range(1, 10)) {
        println(i + "x" + j + "=" + i * j)
      }
    }
  }
}

object AR {
  def main(args: Array[String]) {
    println((1).+(2))
    var a, b, c = 5
    println(a)
    println(b)
    println(c)
  }
}

object LearnScala {
  def main(args: Array[String]): Unit = {
    val range1 = 1 to 10
    println(s"$range1")
    val range2 = 1 until 10
    println(s"$range2")
    val range3 = 1 until 10 by 3
    println(s"$range3")
    println(s"${range1.toList}")
    val moreThan4 = range1.filter(_ > 4)
    println(s"$moreThan4")
    val doublelt = range1.map(_ * 2)
    println(s"$doublelt")
  }
}

object Learn {
  def main(args: Array[String]): Unit = {
    val num = -5
    val numAbs = num.abs //abs 절대값
    val max5or7 = numAbs.max(7)
    val min5or7 = numAbs.min(7) // 5와 7사이의 최소
    println(numAbs)
    println(max5or7)
    println(min5or7)
  }
}

object rtL {
  def main(args: Array[String]): Unit = {
    val reverse = "scala".reverse //거꾸로
    println(s"$reverse")
    val cap = "scala".capitalize //첫글자 대문자
    println(s"$cap")
    val multi = "scala" * 7 //여러번 출력
    println(s"$multi")
    val int = 'A'.toInt //숫자로 바꿔줌
    println(s"$int")
  }
}

object Lea {
  //
  def add(x:Int, y:Int):Int = {
    return x + y
  }

  // ② return을 생략한 메소드
  def addWithoutReturn(x:Int, y:Int) = {
    x + y // return 없어도 됨.
  }

  // ③ 한 줄일 경우 {} 생략가능
  def addWithoutBlock(x:Int, y:Int) = x + y

  def main(args: Array[String]): Unit = {
    println(s"1. ${add(1,2)}")
    println(s"2. ${addWithoutReturn(1,2)}")
    println(s"3. ${addWithoutBlock(1,2)}")
  }
}


object Le {
  def doWith(f: (Int, Int) => Int) = {
    f(1, 2) //리턴 값
  }

  def main(args: Array[String]): Unit = {
    val call1 = doWith((x: Int, y: Int) => x + y)
    //(익명 함수)
    //리턴 값이 x, y로 반환되어 연산함
    val call2 = doWith((x, y) => x + y)
    //위에서 이미 매개변수 타입이(int,int)를 이미 지정
    val call3 = doWith(_ + _)
    //생략 가능함

    println(call1, call2, call3)


  }
}

object LearnS {
  //메소드 정의
  def add1(x: Int, y: Int) = x + y

  //익명함수
  val add2 = (x: Int, y: Int) => x + y
  //
  val add3: (Int, Int) => Int = _ + _
  //
  val add4 = (_ + _): (Int, Int) => Int

  def main(args: Array[String]) = {
    println(s"${add1(42, 13)}")
    println(s"${add2(42, 13)}")
    println(s"${add3(42, 13)}")
    println(s"${add4(42, 13)}")
  }
}

object LearnScal {
  def main(args: Array[String]) = {
    val t1 = Tuple3(1, "hello", true)
    //Tuple은 여러타입의 객체를 담을 수 있다.
    val t2 = (1, "hello", true)
    println(t2)
    var numbers = (1, 2, 3, 4)
    val sum = numbers._1 + numbers._2 + numbers._3 + numbers._4
    println(sum)
  }
}

object Learn1 {
  def swap(x: String, y: String) = (y, x) //앞뒤가 바뀜

  def main(args: Array[String]): Unit = {
    val (a, b) = swap("hello", "world")
    println(a, b)
  }
}

object Learn2 {

  def main(args: Array[String]): Unit = {
    var (x, y, z, c, python, java) = (1, 2, 3, true, false, "no")
    println(x, y, z, c, python, java)

  }
}

object for1 {
  def main(args: Array[String]) {
    var i, sum = 0
    while (i < 10) { //whiel문은 같음
      sum += i
      i += 1 //i++안됨fd
    }
    println(s"$sum")
    sum = 0
    for (i <- 0 until 10) { // i가 0 에서 10사이
      sum += i
    }
    println(s"$sum")

    sum = (0 until 10).sum //
    println(s"$sum")

  }
}

object Learn3 {
  def main(args: Array[String]): Unit = {
    for (a <- 1 to 3) {
      for (b <- 10 to 12) {
        println(a, b)
      }
    }
    println("중첩된 for문 대신 아래와 같이 쓸 수 있습니다.")
    for (a <- 1 to 3; b <- 10 to 12) {
      println(a, b)
    }
  }
}
//for문은 같음
object munjang {
  def main(args: Array[String]): Unit ={
    val rand = new Random()
    var st = Array[String]("PL","은 갓","동아리","입니다")


    for (a <- 1 until  3){
      var x = rand.nextInt(4)



      println(st(x))

    }
  }
}

object Leartn{
  def printArray[K](array:Array[K]) = println(array.mkString("Array(",",",")"))
  def main(args: Array[String]): Unit ={
    val array1 = Array(1,2,3)
    print("1. ")
  printArray(array1)

    val array2 = Array("a",2,true)
    print("2. ")
    printArray(array2)
    // 3. 배열의 값을 읽고 쓰기/
    val itemAtIndex0 = array1(0) //배열 0에 4를 삽입
    array1(0) = 4
    print("3. ")
    printArray(array1)

    val concatenated = "앞에 붙이기" +: (array1 ++ array2) :+"뒤에 붙이기" //배열을 붙일때는 ++
    print("4 array1과 array2를 더하면:")
    printArray(concatenated)
    array2.indexOf("a")

    val diffArray = Array(1,2,3,4).diff(Array(2,3)) //서로 다른 값만 가져오기
    print("5. Array(1,2,3,4).diff(Array(2,3))의 결과:")
    printArray(diffArray)

    val personArray = Array(("승원",1), ("병신",2), ("헤헤",3))
    // ⑥ Find 메소드를 이용해서 findByName이라는 메소드 생성
    // Find는 조건에 맞는 값을 찾으면 검색을 중단
    // getOrElse는 일치하는 값이 없을 경우 넘겨줄 기본 값
    // getOrElse가 없을때 일치하는 값이 없으면 None
    def findByName(name:String) = personArray.find(_._1 == name).getOrElse(("화사",4))
    val findSolar = findByName("승원")  // 값("솔라",1)을 찾아서 넘겨줌
    val findSun = findByName("병신")  // 값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감
    println(findSolar)
    println(findSun)
  }
}