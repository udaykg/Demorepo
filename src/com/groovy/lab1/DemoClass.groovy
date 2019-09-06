class Employee
{
	def name
	def age
	def static retirementAge = 60
	
	Employee(name, age)
	{
		this.name = name;
		this.age = age;
	}
	
	def increaseAgeBy(byAge)
	{
		this.age+=byAge
	}
	
	def displayInfo()
	{
		println "Employee name : $name"
		println "Employee Age : $age"
	}
}

def employee = new Employee('Gill', 28)
employee.increaseAgeBy(1)
employee.displayInfo()
println "Retirement Age : ${Employee.retirementAge}"