val str1 = "foo"
val str2 = "bar"
val int1 = 42
//val newStr = s"$str1/$str2$int1

val pat = "APPSERV-\\d+\\.*".r
val pat2 = "APPSERV-\\.*".r
val msg = "APPSERV-dhhd"
pat matches msg
pat2 matches msg
//msg matches (pat)
