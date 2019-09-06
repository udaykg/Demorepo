def performPrint = {objc, printerFunc, destination ->
	destination(printerFunc(objc))
}

def printer = {
	data -> println "Printing data on Printer $data" 
}
 def DemoPrint = {
	 data -> println "Printing data on DemoPrinter $data"
 }
class User{
	def FName
	def LName
	User (FName, LName)
	{
		this.FName = FName
		this.LName = LName
	}
}

def userObj = new User("xyz", "abc")
def userPrint = {obj -> "FirstName is ${obj.FName}, and Last Name is ${obj.LName}"}
performPrint(userObj, userPrint, printer)
def DemoP = performPrint.rcurry(DemoPrint)
DemoP(userObj, userPrint)