pipeline {
  agent {
    label 'docker-agent-alpine'
  }
  stages {
    stage('Build') {
      steps {
        sh 'java -version' // Verify Java 14 is installed on the agent
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
