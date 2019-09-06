def Mult = {x, y -> x*y}

def triple = Mult.curry(3)
def triplen = Mult.ncurry(1, 4)

println triple(2)
println triplen(2)