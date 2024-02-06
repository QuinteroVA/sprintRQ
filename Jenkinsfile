node {
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build Spring Boot') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }
    }
	}
}