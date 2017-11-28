node {
	stage('Compile') {
	    milestone()
	    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '43fa56ae-2764-4376-a122-17f2d82bfd85', url: 'https://github.com/GijsThonnon/devopscourseceg.git']]])
	    dir ('Chapter3') { 
	    	sh './gradlew compileJava'
		}
	    
	}
	stage('Test') {
	    milestone()
	    dir ('Chapter3') { 
	    	sh './gradlew test'
		}
	}
}