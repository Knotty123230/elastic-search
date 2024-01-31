package com.elasticsearchvideo.service;


import com.elasticsearchvideo.dto.FileMetadataDTO;

import java.util.List;

/**
 * The interface Search.
 */
public interface Search {
    /**
     * Search list.
     *
     * @param search the search
     * @return the list
     */
    List<FileMetadataDTO> search(String search);
}
