pipeline
{
    agent any
    stages
    {
        stage("Cloning from git")
        {
            steps
            {
                git url: 'https://github.com/sunkusrivishnu/spemini',
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
                sh 'ansible-playbook -i inventory run.yml'
            }    
        }
    }

}

