def mapOfValues =[1: 'a', 2:'b', 3:'c']

def collectionOfValues = mapOfValues.collect {k,v -> "$k:$v"}
println collectionOfValues

def joinedCollectionOfValues = collectionOfValues.join(',')
println joinedCollectionOfValues

