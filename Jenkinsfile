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
        stage('Build Docker Image') {
            steps {
                script {
                    bat 'docker build -t ajusha/contactmanager .'
                }
            }
        }
        stage('Push Image to DockerHub') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'DOCKER_HUB', passwordVariable: 'Dockerpass', usernameVariable: 'DockerUser')]) {
                       bat 'echo %Dockerpass% | docker login -u %DockerUser% --password-stdin'
                    }
                    bat 'docker push ajusha/contactmanager'
                }
            }
        }
    }
}