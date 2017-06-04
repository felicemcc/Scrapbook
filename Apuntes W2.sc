
/* RECURSIVE */
//def sum(f: Int =>Int, a: Int, b: Int):Int =
//if(a > b) 0 else f(a)+ sum (f,a+1, b)

def fact (a:Int): Int =
  if (a==0) 1 else a * fact (a-1)

/* TAIL RECURSIVE */

def sum(f: Int => Int) (a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a>b) acc
    else loop(a+1, f(a+1) + acc)
  }
  loop(a, 0)
}


def sumCubes (a:Int, b:Int) :Int = sum( x => x * x * x) (a,b)

sumCubes(2,7)




