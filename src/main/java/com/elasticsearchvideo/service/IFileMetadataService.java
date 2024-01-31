package com.elasticsearchvideo.service;

import com.elasticsearchvideo.dto.FileMetadataDTO;

/**
 * The interface File metadata service.
 */
public interface IFileMetadataService {
    /**
     * Save file metadata dto.
     *
     * @param fileMetadataDTO the file metadata dto
     * @return the file metadata dto
     */
    public FileMetadataDTO save(FileMetadataDTO fileMetadataDTO);
}
