def balance(chars: List[Char]): Boolean = {
  var left = 0
  var right = 0
  if (chars.isEmpty) left == right
  else {
    val char = chars.head
    if (char.equals('(')) left += 1
    if (char.equals(')')) right += 1
    balance(chars.tail)
  }

}

balance("(if (zero? x) max (/ 1 x))".toList)
