package net.dip.objects.guns;

import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.io.InputStream;

public final class GunLoader {

    private static final Gson GSON = new Gson();

    private GunLoader() {}

    public static GunDefinition load(InputStream in) {
        return GSON.fromJson(new InputStreamReader(in), GunDefinition.class);
    }
}

