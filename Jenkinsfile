node {
    stage('Checkout') {
        git 'https://github.com/Fran94/BackendMingeso/'
    }
    
    stage('Compile') {
		sh 'echo "compiling..."'        
		sh 'mvn clean install -DskipTests=true'
    }

    stage('Test') {
		sh 'echo "testing..."' 
		sh 'mvn test'
	}
	
	stage('deploy'){
		sh 'whoami'
		sh 'echo "deploying"' 
		sh 'cp /var/lib/jenkins/workspace/Backend-Pipeline_master/target/demo-0.0.1-SNAPSHOT.war /opt/tomcat/latest/webapps/mingeso_app.war'
	}
}
