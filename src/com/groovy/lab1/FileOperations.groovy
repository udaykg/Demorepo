import java.io.File

import groovy.io.FileType

def storeData(fileName, data){
	new File(fileName).withWriter{
		writer -> writer.writeLine(data)
	}
}
storeData("Demo.txt", "Demo file created")

def readData(fileName){
	def file = new File(fileName)
	println file.text
}

readData("Demo.txt")

def createDirectory(dirName){
	def file = new File(dirName)
	println file.mkdir()
}


createDirectory("DemoFolder")

def deleteFile(fileName){
	def file = new File(fileName)
	println file.delete()
}
deleteFile("Demo.txt")

def listDir(dirName){
	new File(dirName).eachFileRecurse(FileType.FILES){
		file -> println file.getAbsolutePath()
	}
}

listDir('C:/Users/Administrator/Desktop/Scripts')