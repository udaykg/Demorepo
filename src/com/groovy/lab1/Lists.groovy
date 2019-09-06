import static java.util.Calendar.getInstance as now

println now().time

println([1,2,3].collect{it +3})
println([1,2,3].disjoint([2,1,3]))
println([1,2,3].intersect([1,3]))