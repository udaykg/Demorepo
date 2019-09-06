list1 = [1,4,6,7]
list2 = [6,5,7,6]

def func(int i)
{
	if(i==0)
	{
		def sum =0
		list1.sum()
	}
	else if(i==1)
	{
		mul(list2)
	}
}

def mul(list2)
{
	list2.inject(1, {a,b -> a*b})
}

def AddResult = func(0)
println "AddResult: $AddResult"

def MulResult = func(1)
println "MulResult: $MulResult"

if(AddResult>100)
	println list2+=list1
else
	println list1+=list2
	
if(MulResult>100)
	println list2+=list1
else
	println list1+=list2
	