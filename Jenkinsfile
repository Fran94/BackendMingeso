node{
  stage('SCM Checkout'){
    git 'https://github.com/Fran94/BackendMingeso'
  }
  stage('Compile-Package'){
    //Get maven home path
    def mvnHome = tool name: 'maven', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
