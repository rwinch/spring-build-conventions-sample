stage('Build') {
	parallel test: {
		stage('Test') {
			node {
				checkout scm
				try {
					withCredentials([file(credentialsId: 'private-key', variable: 'SECRET_KEY')]) {
						sh "echo $SECRET_KEY"
 						sh './gradlew clean test -PDOCS_PRIVATE_KEY=$SECRET_KEY --no-daemon'
					}
				} finally {
					junit '**/build/*-results/*/*.xml'
				}
			}
		}
	},

	itest: {
		stage('iTest') {
			node {
				checkout scm
				sh './gradlew iTest --no-daemon'
			}
		}
	},

	stageDocs: {
		stage('stage docs') {
			node {
				checkout scm
				sh './gradlew stageDocs --no-daemon'
			}
		}
	}
}

stage('Deploy') {
	if (currentBuild.result == 'SUCCESS') {
		sh './gradlew deploy --no-daemon'
	}
}