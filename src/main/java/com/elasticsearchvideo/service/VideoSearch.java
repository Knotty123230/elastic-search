package com.elasticsearchvideo.service;


import com.elasticsearchvideo.dto.FileMetadataDTO;
import com.elasticsearchvideo.elastic_repository.FileMetadataElasticSearchRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class VideoSearch implements Search {
    private final FileMetadataElasticSearchRepository repository;

    public VideoSearch(FileMetadataElasticSearchRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<FileMetadataDTO> search(String search) {

        List<FileMetadataDTO> metadataByHeader = repository.findByHeaderContaining(search, PageRequest.of(0, 20)).getContent();
        List<FileMetadataDTO> metadataByDescription = repository.findByDescriptionContainingIgnoreCase(search, PageRequest.of(0, 20)).getContent();

        return Stream.concat(metadataByHeader.stream(), metadataByDescription.stream())
                .toList();

    }

}
