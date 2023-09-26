docker stop happy || true
docker rm happy || true
docker build -t happy .
docker run -d -p 8091:8091 happy