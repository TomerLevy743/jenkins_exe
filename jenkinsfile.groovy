pipeline {
        agent any
        environment {
        hello_file = ~/test.sh
        stages {
                stage('build') {
                        steps {
                                echo 'build stage started'
                                sh('./test.sh')
                        }
                }
	}
}
