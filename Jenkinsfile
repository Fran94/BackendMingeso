node{
  stage('SCM Checkout'){
    git 'https://github.com/Fran94/BackendMingeso'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
