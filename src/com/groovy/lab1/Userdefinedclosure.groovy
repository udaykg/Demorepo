def doubleNum = {
	num -> num*2
} 
println doubleNum(3)

def processThenPrint = {
	num, demo -> num = demo(num)
	println "num is $num"
}

processThenPrint(3, doubleNum)