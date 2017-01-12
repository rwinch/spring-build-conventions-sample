stage('OSSRH Deploy') {
	node {
		checkout scm
		withCredentials([string(credentialsId: 'spring-gpg-passphrase', variable: 'SIGNING_PASSWORD')]) {
			sh "echo hi"
		}
	}
}