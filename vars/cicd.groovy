def newgit(rap)
{
  git "https://github.com/intelliqittrainings/${rap}.git"
  }
def newmaven()
{
  sh 'mvn package'
}
def newcode(jobname,ipaddress,context)
{
  sh"scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/${context}.war"
}
def runselenium(jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
