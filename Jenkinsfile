pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building java project'
        sh 'javac JenkinsTest.java'
        echo 'Successfully build'
      }
    }
    stage('Execute approval'){
       input{
        id "DeployTest"
        message "Move to Test?"
        ok "Yes"
      } 
      steps{
        echo "jenkins"
      }
    }
    stage('Execute') {
      steps {
        echo "Hello World"
        echo 'Executing java project'
        sh 'java JenkinsTest'
        echo 'Successfully excuted java project'
      }
    }
  }
}