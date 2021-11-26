pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				echo "mvn -f ./target/checkout/ compile"
			}
		}
		stage('Test') {
			steps {
				echo "mvn -f ./target/checkout/ test"
			}
		}
		stage('Package') {
			steps {
				echo "mvn -f ./target/checkout/ package"
			}
		}
		stage('Deploy') {
			steps {
				echo "mv target/checkout/monappli-web/target/monappli-web.war C:/Program\\ Files/Apache\\ Software\\ Foundation/Tomcat\\ 9.0/webapps/monappli-web.war"
			}
		}
	}
}