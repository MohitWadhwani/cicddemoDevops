//Jenkins file for Window 10
node{
    
    stage('git checkout'){
        git 'https://github.com/MohitWadhwani/cicddemoDevops.git'
    }
    
    stage('build & test'){
        bat label: '', script: 'mvn package spring-boot:repackage'
    }
   stage("build docker image"){
      bat label: '', script: 'docker build -t 8458882343/bootcampdevops:1.2 .'
    }
    
    stage("push docker image to hub"){
withCredentials([usernamePassword(credentialsId: 'dockerlogin', passwordVariable: 'login', usernameVariable: 'docker')]) {
    bat label: '', script: 'docker login -u {docker} -p {login}'
}
 bat label: '', script: 'docker push 8458882343/bootcampdevops:working'
}
 stage("run docker image"){
     bat label: '', script: 'docker run -p 9000:8080 8458882343/bootcampdevops:1.2'
 }
}