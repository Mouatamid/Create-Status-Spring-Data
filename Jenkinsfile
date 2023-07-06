pipeline {
  agent any
  tools {
       maven 'Maven 3.5.4'
  }
  stages {
    stage('Build') {
      steps {
        sh 'java -version' // Verify Java 14 is installed on the agent
        sh 'mvn -version'
      }
    }
    stage('Test') {
      steps {
        echo "Testing..."
      }
    }
    stage('Deploy') {
      steps {
        echo "Deploying..."
      }
    }
  }
}
