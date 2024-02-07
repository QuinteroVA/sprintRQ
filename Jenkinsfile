pipeline {
  agent any
    stages {
      stage('Checkout') {
        steps {
          sh 'checkout scm'
        }
      }
      stage('Build Spring Boot') {
        steps {
          script {
            env.PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
            sh './mvnw.cmd clean package'
          }
        }
     }
  }
}
