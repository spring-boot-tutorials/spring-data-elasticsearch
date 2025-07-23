package com.example.Elasticsearch;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.util.List;

import static org.springframework.data.elasticsearch.annotations.FieldType.Date;

@Data
@SuperBuilder
@Document(indexName = "conference-index")
@NoArgsConstructor
public class Conference {

    @Id
    private String id;

    private String name;

//    @Field(type = Date)
//    private String date;
//
//    private GeoPoint location;
//
//    private List<String> keywords;
}
