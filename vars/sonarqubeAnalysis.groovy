def call() {
    withSonarQubeEnv('sonar_server') {
                    sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=youtube -Dsonar.projectKey=youtube '''
                }
    }
