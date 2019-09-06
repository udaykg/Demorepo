import static java.lang.Math.*

piA = {22/7}
piB = {333/106}

howCloseToPI = {abs(it.value() - java.lang.Math.PI)}

algorithms = [piA:piA , piB:piB]
println algorithms
findBestPI(algorithms)

def findBestPI(map)
{
	map.sort(howCloseToPI).each{entry ->
		def diff = howCloseToPI(entry)
		
		println "Algorithm $entry.key differs by $diff"
	}
}