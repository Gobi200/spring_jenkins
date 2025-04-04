pipeline{
    agent any
        tools{
            jdk 'JDK 17'
            maven 'Maven'
        }
        stages{
            stage('Build Maven'){
                steps{
                    checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Gobi200/spring_jenkins.git']])
                    bat 'mvn clean install'
                }
            }
           
        }
}