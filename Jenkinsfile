// Declarative //
pipeline {
	agent any
	stages {
		stage('Build') {
			sh "mvn -f ./target/checkout/ compile"
		}
		stage('Test') {
			sh "mvn -f ./target/checkout/ test"
		}
		stage('Package') {
			sh "mvn -f ./target/checkout/ package"
		}
		stage('Deploy') {
			sh "mv target/checkout/monappli-web/target/monappli-web.war C:/Program\\ Files/Apache\\ Software\\ Foundation/Tomcat\\ 9.0/webapps/monappli-web.war"
		}
	}
}