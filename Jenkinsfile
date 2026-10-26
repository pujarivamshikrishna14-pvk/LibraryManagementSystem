
pipeline {
    agent any

    tools {
        jdk 'JDK-25'
        maven 'Maven-3.10.0'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out Library Management System source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling the project'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the application'
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESS - Library Management System'
        }

        failure {
            echo 'BUILD FAILED - Check Console Output'
        }

        always {
            echo 'Jenkins pipeline execution completed'
        }
    }
}
