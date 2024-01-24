package com.elasticsearchvideo.service;


import com.elasticsearchvideo.dto.FileMetadataDTO;

import java.util.List;

public interface Search {
    List<FileMetadataDTO> search(String search);
}
