package com.mycompany.HorstmannTasks.InterfLambdaExpr;

import java.io.File;

public class Ex12 {
    String[] lsFilesOfExtension(String pathname, String ext) {
        File file = new File(pathname);

        return file.list((File directory, String name) -> {
            String[] nameArr = name.split("\\.");
            if (nameArr.length == 0) {
                return false;
            }

            return nameArr[nameArr.length - 1].equals(ext);
        });
    }
}
