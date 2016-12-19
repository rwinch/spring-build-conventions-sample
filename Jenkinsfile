node {
    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        sh './gradlew clean assemble'
    }

    stage('Test') {
        sh './gradlew test'
        junit 'build/*-results/*/*.xml'
    }

    stage('Integration Test') {
        sh './gradlew iTest'
    }

    stage('Stage Docs') {
        sh './gradlew stageDocs'
    }

    stage('Deploy') {
        sh './gradlew deploy'
    }
}