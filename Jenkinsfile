stage('OSSRH Deploy') {
	node {
		checkout scm
		withCredentials([file(credentialsId: 'spring-signing-secring.gpg', variable: 'SIGNING_KEYRING_FILE')]) {
			withCredentials([string(credentialsId: 'spring-gpg-passphrase', variable: 'SIGNING_PASSWORD')]) {
				sh "echo hi"
			}
		}
	}
}