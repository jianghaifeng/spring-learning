docker run -d -p 5432:5432 \
 -e POSTGRES_DB=test \
 -e POSTGRES_USER=local \
 -e POSTGRES_PASSWORD=local \
 -v /Users/haifeng.jiang/Downloads/data:/var/lib/postgresql/data \
 postgres:9.6-alpine