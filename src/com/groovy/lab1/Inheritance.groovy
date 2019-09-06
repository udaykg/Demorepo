class Human
{
	def talk(words)
	{
		println words
	}
}

class Staff extends Human
{
	def name
	def age
	Staff(name, age)
	{
		this.name = name
		this.age = age
	}
	
	def increaseAgeBy(ageValue)
	{
		this.age+=ageValue
	}
	def displayInfo()
	{
		println"My name is $name and age is $age"
	}
}

def employee = new Staff('Gill', 35)
employee.talk("Hey hi hi hi")
employee.displayInfo()
