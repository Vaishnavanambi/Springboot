package com.Learning.Learning;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventsData {
    @JsonProperty("name")
    private String name;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("prometheusId")
    private String prometheusId;

    @JsonProperty("key")
    private String key;

    @JsonProperty("trapId")
    private String trapId;

    @JsonProperty("nodeType")
    private String nodeType;

    @JsonProperty("eventType")
    private String eventType;

    @JsonProperty("alarm")
    private boolean alarm;
}
