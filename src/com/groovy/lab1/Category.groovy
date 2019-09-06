import org.codehaus.groovy.syntax.Numbers

enum Cat{
	None, Up, Down
}

numbers = [
	1: Cat.Up,
	2: Cat.Up,
	3: Cat.Down,
	4: Cat.Up,
	5: Cat.Up,
	6: Cat.Down,
	7: Cat.Up,
	8: Cat.Up,
	9: Cat.Down,
	0: Cat.Down,
	]

def CheckCount(list)
{
	def Up =0, Down= 0, None =0
	for(no in list)
	{
		if(numbers[no] == Cat.Up)
			Up++
		else if(numbers[no] == Cat.Down)
			Down++
		else
			None++
	}
	[Up, Down, None]
}

def findCountCollect(list)
{
	def categories = list.collect{numbers[it]}
	println categories
	
	def groupedcat = categories.groupBy{it}
	println groupedcat
	
	def countcat = groupedcat.collect{[(it.key):(it.value.size())]}
	println countcat
}
def printResult(count)
{
	println"Up Count :${count[0]}"
	println"Down Count :${count[1]}"
	println"None Count :${count[2]}"
}

def list = [1,3,5,7]
printResult(CheckCount(list))
findCountCollect(list)

