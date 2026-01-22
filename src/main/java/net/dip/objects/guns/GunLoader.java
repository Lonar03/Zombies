package net.dip.objects.guns;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.InputStream;

public final class GunLoader {

    private static final ObjectMapper MAPPER = new ObjectMapper(new YAMLFactory());

    private GunLoader() {}

    public static GunDefinition load(InputStream in) throws Exception {
        return MAPPER.readValue(in, GunDefinition.class);
    }
}

