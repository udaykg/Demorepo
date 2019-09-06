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
        def disk_size = sh(script: "df / --output=avail | tail -1", returnStdout:true).trim() as Integer
        println("disk_size= ${disk_size}")
    }
    }
    }
    
    
}
