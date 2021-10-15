package com.tekcapsule.topic.domain.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import javax.management.Query;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class SearchQuery extends Query {
    private String tenantId;
}
