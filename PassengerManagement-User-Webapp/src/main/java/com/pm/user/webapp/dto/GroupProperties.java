package com.pm.user.webapp.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "type")
public class GroupProperties {

    Map<FolioType, String> groups;

    public Map<FolioType, String> getGroups() {
        return groups;
    }

    public void setGroups(Map<FolioType, String> groups) {
        this.groups = groups;
    }
}
