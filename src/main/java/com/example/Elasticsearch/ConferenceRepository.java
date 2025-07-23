package com.example.Elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferenceRepository extends ElasticsearchRepository<Conference, String> {
    List<Conference> findByName(String name);
}
