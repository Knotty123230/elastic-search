package com.elasticsearchvideo.service;

import com.elasticsearchvideo.dto.FileMetadataDTO;
import com.elasticsearchvideo.elastic_repository.FileMetadataElasticSearchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.elasticsearchvideo.constants.KafkaConstants.KAFKA_CONSUMER_GROUP_ID;
import static com.elasticsearchvideo.constants.KafkaConstants.TOPIC_CREATE_ORDER;

/**
 * The type File metadata service.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class FileMetadataService implements IFileMetadataService {
    private final FileMetadataElasticSearchRepository fileMetadataElasticSearchRepository;

    @KafkaListener(topics = TOPIC_CREATE_ORDER, groupId = KAFKA_CONSUMER_GROUP_ID, properties = {"spring.json.value.default.type=com.elasticsearchvideo.dto.FileMetadataDTO"})
    @Override
    public FileMetadataDTO save(FileMetadataDTO fileMetadataDTO) {
        log.info("consuming file metadata {}", fileMetadataDTO);
        return fileMetadataElasticSearchRepository.save(fileMetadataDTO);
    }
}
