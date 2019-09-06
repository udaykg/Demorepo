//---- Collection of numbers
println 'Collection of numbers example'
def nos = 1..10
println(nos)
for(no in nos)
	println no
println()

//---- Collection of numbers
println 'Collection of number less than '
def num = 1..<10
println(num)
for(num1 in num)
	println num1
println()


def list = [1,3,5,7, 'Kolkata', 'Bengaluru']
list += [50, true, 100, 'Electronics city']
println (list)
println (list*2)
println (list*3)


//---- Key value pair
def desig = [10 :'VP', 11:'SVP', 12:'AVP', 13:'Manager']
println desig[10]
desig[10] = 'Vice President'
println desig[10]
println()

//----Contains method
println 'Contains methods example'
def lang = ['Java', 'Python', 'Groovy']
println(lang.reverse())
lang.add('C#')
println(lang)
println(lang.contains('ruby'))