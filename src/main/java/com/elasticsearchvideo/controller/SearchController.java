package com.elasticsearchvideo.controller;


import com.elasticsearchvideo.dto.FileMetadataDTO;
import com.elasticsearchvideo.service.Search;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Search controller.
 */
@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class SearchController {
    private final Search search;

    /**
     * Gets search.
     *
     * @param search the search
     * @return the search
     */
    @GetMapping
    public ResponseEntity<List<FileMetadataDTO>> getSearch(@RequestParam("search") String search) {
        return ResponseEntity.ok(this.search.search(search));
    }
}
