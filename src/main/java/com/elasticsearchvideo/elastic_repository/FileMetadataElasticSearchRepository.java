package com.elasticsearchvideo.elastic_repository;

import com.elasticsearchvideo.dto.FileMetadataDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * The interface File metadata elastic search repository.
 */
public interface FileMetadataElasticSearchRepository extends ElasticsearchRepository<FileMetadataDTO, String> {
    /**
     * Find by header containing page.
     *
     * @param name     the name
     * @param pageable the pageable
     * @return the page
     */
    Page<FileMetadataDTO> findByHeaderContaining(String name, Pageable pageable);

    /**
     * Find by description containing ignore case page.
     *
     * @param description the description
     * @param pageable    the pageable
     * @return the page
     */
    Page<FileMetadataDTO> findByDescriptionContainingIgnoreCase(String description, Pageable pageable);
}
