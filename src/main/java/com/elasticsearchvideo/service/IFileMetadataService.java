package com.elasticsearchvideo.service;

import com.elasticsearchvideo.dto.FileMetadataDTO;

public interface IFileMetadataService {
    public FileMetadataDTO save(FileMetadataDTO fileMetadataDTO);
}
