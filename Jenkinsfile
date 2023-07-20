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
                // sh 'mvnw wrapper:wrapper'
                sh 'mvn -DskipTests clean'
                sh 'mvn -DskipTests compile'
            }
        }
        
        stage('Test') {
            steps {
                // Test adımları
                sh 'mvnw test'
            }
        }
        
        stage('Deploy') {
            steps {
                // Uygulamayı dağıtma adımları
                sh 'mvnw spring-boot:run'
            }
        }
    }
}
