trait Fylable
{
	def fly()
	{
		println "I can fly"
	}
}

trait Runnable
{
	def run()
	{
		println "I can run"
	}
}

class Bird implements Fylable, Runnable
{

}

def bird = new Bird()
bird.run()
bird.fly()