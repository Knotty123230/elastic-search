package com.elasticsearchvideo.elastic_repository;

import com.elasticsearchvideo.dto.FileMetadataDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface FileMetadataElasticSearchRepository extends ElasticsearchRepository<FileMetadataDTO, String> {
    Page<FileMetadataDTO> findByHeaderContaining(String name, Pageable pageable);

    Page<FileMetadataDTO> findByDescriptionContainingIgnoreCase(String description, Pageable pageable);
}
