

stage('Deploy') {
	node {
		checkout scm
		withCredentials([file(credentialsId: 'ssh_id_rsa', variable: 'SSH_KEY')]) {
			withCredentials([usernamePassword(credentialsId: 'ssh_username_passphrase', passwordVariable: 'SSH_PASSPHRASE', usernameVariable: 'SSH_USERNAME')]) {
				println SSH_KEY.class
				sh "./gradlew deploy -PSSH_KEY=$SSH_KEY?.absolutePath -PSSH_USERNAME=$SSH_USERNAME -PSSH_PASSPHRASE=$SSH_PASSPHRASE --no-daemon"
			}
		}
	}
}