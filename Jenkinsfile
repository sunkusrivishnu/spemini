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

        stage("Compiling, testing and packaging with Maven")
        {
            steps 
            {
                // Maven build, 'sh' specifies it is a shell command
                sh 'mvn clean install'
            }
        }
    }
}