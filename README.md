see: http://spring-guides.marcuschiu.com/spring-data/elasticsearch/spring-boot-elasticsearch.html

# Run Elasticsearch
```shell
docker run \
 --name es762 \ 
 -p 9200:9200 \
  -e "discovery.type=single-node" \
  -e "xpack.security.enabled=false" \
  -e "xpack.security.http.ssl.enabled=false" \
  -e "xpack.security.enrollment.enabled=false" \
  elasticsearch:8.17.5
```

# Run Application