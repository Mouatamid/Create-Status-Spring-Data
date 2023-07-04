pipeline {
  agent {
    label 'docker-agent-java14'
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
