package com.elasticsearchvideo.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(indexName = "file")
public class FileMetadataDTO {
    @Id
    private String id;
    @Field(type = FieldType.Text)
    private String header;
    @Field(type = FieldType.Text)
    private String description;
    private Long size;
    private String name;
    private String httpContentType;
}
