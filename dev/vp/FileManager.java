package dev.vp;

import com.google.gson.Gson;

import java.io.File;

public class FileManager {

    private static Gson gson = new Gson();

    private static File ROOT_DIR = new File("vMod");
    private static File MODS_DIR = new File(ROOT_DIR, "Mods");

    public static void init() {

        if (!ROOT_DIR.exists()) { ROOT_DIR.mkdirs(); }
        if (!MODS_DIR.exists()) { MODS_DIR.mkdirs(); }
    }

    public static Gson getGson() {
        return gson;
    }

    public static File getModsDirectory() {
        return MODS_DIR;
    }

    public static boolean writeJsonToFile(File file, Object obj) {
        
    }

}
