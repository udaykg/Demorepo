pipeline{
    agent any
    stages {
        stage('Stage One'){
        	steps{
            echo 'Loading external file'
            script{
                def echoer = load "./JenkinsScripts/echoer.groovy"
                echoer.echoIT('Hello World')
            }
			echo 'Loaded file and called'
			sh "echo Hello from the Shell"
			sh "hostname"
            }
      
        }
stage ('Stage two')
    {
    steps{
    script{
        
        def echoer = load "./src/com/groovy/lab1/Category.groovy"
    }

        
    }
    }
    }
    
    
}
