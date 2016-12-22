

stage('Deploy') {
		withCredentials([file(credentialsId: 'private-key', variable: 'SECRET_KEY')]) {
			sh "./gradlew deploy -PSECRET_KEY=$SECRET_KEY --no-daemon"
		}
}