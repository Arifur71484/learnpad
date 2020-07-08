For Building The Learnpad the Main Dependencies are: 

Be sure the following tools have been installed on your system before to start :

git
maven
curl
unzip
build-essential (in Ubuntu, or similar)
Java 11 (but better to use Java 8 - see issue #612)
Bash Shell

Build : 

First of all, clone the repository.

git clone https://github.com/LearnPAd/learnpad.git
Then, once cloned, you can trigger a build with the build script in the root directory.

./build

Run :

After the build, a complete wiki instance will exists in the directory lp-platform and it will be the core of the platform. You should be able to run the platform with the following command

bash launch start
You can also stop it with the following command.

bash launch stop
or restart it (it will stop every component then start it again)

bash launch restart
Once the platform is started, access it on http://localhost:8080/xwiki in your web-browser.

DockerFile :

1. TO create the Docker container for each component of learnpad first go to the specific component .
2. Then For each docker container use the docker run command to create the docker container .
3. For running multiple docker container we can use docker-compose file at a same time .
4. To convert the docker container into kubernets pods first install the Kompose tools .
5. Then convert the docker container into kubernets pods by using kompose compand .
6. we can use minikube or openshift cloud to deploy the kubernets pods or other cloud platform for deploy the kubernets pods .
