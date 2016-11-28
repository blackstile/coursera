def max (xs:List[Int]):Int = {
  var  value = if (xs.isEmpty) 0 else xs.head
  if (xs.isEmpty || value > max(xs.tail)) value
  else max(xs.tail)
}
max(List(1,2,3,15,4,6,8,7))
max(List())