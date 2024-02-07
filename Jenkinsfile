pipeline {
	agent any
	enviroment {
		JAVA_HOME = 'C:/Program Files/Java/jdk-17'
	}
	stages {
		stage('Checkout') {
			steps {
				checkout scm
			}
		}
		stage('Build Spring Boot') {
			steps {
				script {
					env.PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
					'./mvnw.cmd clean package'
				}
			}
		}
	}
}
