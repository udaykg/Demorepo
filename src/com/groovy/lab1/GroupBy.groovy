def names = [
	[name : 'Uday', city :'Bengaluru'],
	[name : 'Kajin', city :'Hyderabad'],
	[name : 'Ajith', city :'Bengaluru'],
	[name : 'Suresh', city :'TN'],
	[name : 'Bharathi', city :'TN'],
	[name : 'Saraswathi', city :'Bengaluru'],
	[name : 'Roopesh', city :'Hyderabad']
	]
	
def cities = names.groupBy{it.city}
println cities

cities.keySet()