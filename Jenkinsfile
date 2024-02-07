pipeline {
	agent any
  stages {
      stage('Checkout') {
              checkout scm
      }
      stage('Build Spring Boot') {
              'clean package'
        }
    }
}
