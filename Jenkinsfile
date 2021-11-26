pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh "mvn -f ./target/checkout/ compile"
			}
		}
		stage('Test') {
			steps {
				sh "mvn -f ./target/checkout/ test"
			}
		}
		stage('Package') {
			steps {
				sh "mvn -f ./target/checkout/ package"
			}
		}
		stage('Deploy') {
			steps {
				sh "mv target/checkout/monappli-web/target/monappli-web.war C:/Program\\ Files/Apache\\ Software\\ Foundation/Tomcat\\ 9.0/webapps/monappli-web.war"
			}
		}
	}
}