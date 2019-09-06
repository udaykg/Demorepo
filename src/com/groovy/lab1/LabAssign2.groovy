def deviceInfo = "123 ABC 30\n124 XYZ 31\n125 EFG 30\n126 MNO 31\n127 RST 32\n128 TUV 31"
def eventsInfo = "331 124\n332 123\n333 125\n334 126\n335 123"

def devicesFile = "devices.txt"
def eventsFile = "events.txt"

def createFile(name, data) {
	def file = new File(name)
	file.delete()
	file << data
}

createFile(devicesFile, deviceInfo)
createFile(eventsFile, eventsInfo)
println "Files Created..."

//------------------------------------------------------------

def readFiles(fileName){
	def file = new File(fileName)
	def stringList = file.text.split("\n")
	println stringList
	stringList.collect{x -> x.split(" ")}
}

def findDeviceIDs(locationId, devices){
	devices.findAll{it[2] == locationId}.collect{it[0]}
}

def findEventsAndPrint(events, deviceIds){
	println "\nEVENTS :"
	println "-------"
	println events.findAll{x-> deviceIds.contains(x[1])}
}

def devices = readFiles(devicesFile)
def events = readFiles(eventsFile)

println "DEVICES : ${devices}"
println "EVENTS : ${events}"
println "\n"

def devs = findDeviceIDs("30", devices)
findEventsAndPrint(events, devs)	//PASS THE DEVICE ID HERE

