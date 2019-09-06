println "Hello World!"

def no =1;
no = 'Xyz';
println no

//-----Interpolator operator-----
def (name, org) = ["Uday", "Siemens"]
println("My name is $name and I work for $org")
println ();
//-----*****-----


//-----Key value pair example-----
def person = [name:"Bill", age:25]
println "Name - $person.name, Age - $person.age"
println ();
//-----*****-----

//-----Array example
println "Array example";
String[] arr = ['Ramesh', 'Suresh', 'Mukesh'];
println arr[0]; println arr[1]; println arr[2]
println (arr.size());
println ();
//-----*****-----

//----Multidimensional array
println "Define and print multi dimensional array";
def multiarr = [['B', 'Bengaluru'], ['M','Mangalore']]
println multiarr[0]; println multiarr[1]
println multiarr[0][0]; println multiarr[1][0];
println multiarr[0][1]; println multiarr[1][1];
println ();
//-----*****-----

///-----Print single dimensional array
println "Print single dimensional array";
for(single in arr)
{
	println single
}
println ();

///-----Print multi dimensional array
println "Print multi dimensional array";
for(multi in multiarr)
{
	println multi
}
println ();


//----Method example
println 'Method example';
def sayHiiii()
{
	println"Hi hi hi"
}
 sayHiiii()
 println ()

//Calling different method
 println 'Calling the methods';
 def addition(int num1, int num2)
 {
	 num1 + num2
 }
 println (addition(10,20))
 println ()
 
 
 //VarArgs example
 println 'VarArgs example';
 def printMessage(message, ...vals)
 {
	 println message
	 for( val in vals)
		 println val
 }
 
 printMessage("Hello")
 println()
 
 
 
 
 
 
 
