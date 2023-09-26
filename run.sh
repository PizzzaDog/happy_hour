git pull
docker stop happy_con || true
docker rm happy_con || true
docker build -t happy .
docker run -d -p 8091:8091 --name happy_con happy