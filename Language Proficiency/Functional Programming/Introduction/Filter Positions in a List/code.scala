def f(arr:List[Int]):List[Int] = arr.zipWithIndex.collect { case (a, i) if i % 2 == 1 => a }