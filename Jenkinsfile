pipeline
{
    agent any
    stages
    {
        stage("Cloning from git")
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

        stage("Building the docker image")
        {
            steps
            {
                sh 'docker build -t srivishnusunku/speminicalc:latest .'
            }
        }

        stage("Publishing the docker image")
        {
            steps 
            {
                    sh 'docker push srivishnusunku/speminicalc:latest'
            }
        }

        stage("Removing the image")
        {
            steps
            {
                sh 'docker rmi -f srivishnusunku/speminicalc:latest'
            }
        }

        stage("Pulling and running the image")
        {
            steps
            {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'run.yml', sudoUser: null
            }
        }

    }
}
