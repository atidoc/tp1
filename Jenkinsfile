pipeline {
	agent any
	stages {
		stage('Build') {
			echo "mvn -f ./target/checkout/ compile"
		}
		stage('Test') {
			echo "mvn -f ./target/checkout/ test"
		}
		stage('Package') {
			echo "mvn -f ./target/checkout/ package"
		}
		stage('Deploy') {
			echo "mv target/checkout/monappli-web/target/monappli-web.war C:/Program\\ Files/Apache\\ Software\\ Foundation/Tomcat\\ 9.0/webapps/monappli-web.war"
		}
	}
}