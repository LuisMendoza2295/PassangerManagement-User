package com.pm.user.webapp.config;

import com.pm.user.webapp.dto.FolioType;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class GroupConverter implements Converter<String, FolioType> {

    @Override
    public FolioType convert(String s) {
        return FolioType.fromApiCode(s.toUpperCase());
    }
}
