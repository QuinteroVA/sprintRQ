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
              'clean package'
            }
        }
    }
}
