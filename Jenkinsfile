pipeline
{
    agent any
    stages
    {
        stage('Cloning from git')
        {
            steps
            {
                git url: 'https://github.com/inspiringrai/MINI_PROJECT.git',
				branch: 'main',
                credentialsId: 'GitCredential'
            }

        }

        stage("Maven clean")
        {
            steps 
            {
                // Maven build, 'sh' specifies it is a shell command
                sh 'mvn clean install'
            }
        }
    }
}