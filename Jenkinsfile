pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checkout stage'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            echo 'Library Management System build completed successfully!'
        }
        failure {
            echo 'Build failed. Please check the Jenkins console output.'
        }
    }
}