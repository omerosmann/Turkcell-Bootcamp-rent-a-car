pipeline {
    agent any
    environment {
    MAVEN_ARGS=" -e clean install"
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Kod deposundan projeyi çekmek için kullanılan adımlar
                checkout scm
            }
        }
       
        stage('Build') {
            steps {
               withMaven(maven: 'MAVEN_ENV') {
                sh "mvn ${MAVEN_ARGS}"
                }
            }
        }

        
        stage('Test') {
            steps {
                // Test adımları
                sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                // Uygulamayı dağıtma adımları
                sh 'mvn spring-boot:run'
            }
        }
    }
}
