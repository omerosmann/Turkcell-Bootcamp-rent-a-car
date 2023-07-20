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
                bat 'cd Turkcell-Bootcamp-rent-a-car && mvn -DskipTests clean'
                bat 'cd Turkcell-Bootcamp-rent-a-car && mvn -DskipTests compile'
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
