pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh "mvn compile"
			}
		}
		stage('Test') {
			steps {
				sh "mvn test"
			}
			{
				post {
					success {
						junit '*/target/surefire-reports/*.xml'
					}
				}
			}
		}
		stage('Package') {
			steps {
				sh "mvn package"
			}
		}
		stage('Deploy') {
			steps {
				sh "mv monappli-web/target/monappli-web.war C:/Program\\ Files/Apache\\ Software\\ Foundation/Tomcat\\ 9.0/webapps/monappli-web.war"
			}
		}
	}
}