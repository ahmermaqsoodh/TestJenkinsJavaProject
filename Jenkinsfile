pipeline{
    agent any
    stages {
        stage("Build"){
            steps {
                javac JenkinsTest.java
            }
        }
        stage("Execute"){
            steps{
                java JenkinsTest
            }
        }
    }
}