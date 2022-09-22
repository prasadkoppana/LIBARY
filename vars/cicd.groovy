def newgit(rap)
{
  git "https://github.com/intelliqittrainings/${rap}.git"
  }
def newmaven()
{
  sh 'mvn package'
}
