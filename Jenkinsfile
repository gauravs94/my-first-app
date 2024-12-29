pipeline {
    agent{
        docker{
            image 'maven:3.9.9'
        }

    }

    stages {
        stage("Checkout"){
            steps {
                sh '''
                echo 'pipleline started'
                echo 'checkout stage'
                '''
                git branch: 'main', url: 'https://github.com/gauravs94/my-first-app.git'
            }
        }

        stage("Build"){
            steps{
                sh "echo 'build stage'"
                sh 'mvn -v'
            }
        }

        stage("Test"){
            steps{
                sh "echo 'test stage'"
            }
        }

        stage("Run"){
            steps{
                sh '''
                echo 'run stage'
                echo 'pipeline ended'
                '''
            }
        }
    }

}