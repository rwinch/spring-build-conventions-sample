stage('OSSRH Deploy') {
	node {
		checkout scm
		withCredentials([file(credentialsId: 'spring-signing-secring.gpg', variable: 'SIGNING_KEYRING_FILE')]) {
			withCredentials([string(credentialsId: 'spring-gpg-passphrase', variable: 'SIGNING_PASSWORD')]) {
				sh "./gradlew uploadArtifacts -Psigning.secretKeyRingFile=$SIGNING_KEYRING_FILE -Psigning.keyId=$SPRING_SIGNING_KEYID -Psigning.password=$SIGNING_PASSWORD --no-daemon"
			}
		}
	}
}