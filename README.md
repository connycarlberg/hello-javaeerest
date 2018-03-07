# Build
mvn clean package && docker build -t afterrain/hello-javaeerest .

# RUN

docker rm -f hello-javaeerest || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-javaeerest afterrain/hello-javaeerest 

git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/connycarlberg/hello-javaeerest.git
git push -u origin master
