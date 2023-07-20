pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Kod deposundan projeyi çekmek için kullanılan adımlar
                checkout scm
            }
        }
       
        stage('Build') {
            steps {
                // Maven kullanarak projeyi derleme adımları
                sh './mvnw wrapper:wrapper'
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
