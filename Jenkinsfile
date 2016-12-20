stage('Build') {
	parallel test: {
		node {
			checkout scm
			sh './gradlew test'
		}
	},

	itest: {
		node {
			checkout scm
			sh './gradlew iTest'
		}
	},

	stageDocs: {
		node {
			checkout scm
			sh './gradlew stageDocs'
		}
	}
}

stage('Deploy') {
	if (currentBuild.result == 'SUCCESS') {
		sh './gradlew deploy'
	}
}