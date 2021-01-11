package com.mycompany.HorstmannTasks.InterfLambdaExpr;

import java.io.File;
import java.io.FileFilter;

public class Ex11 {

    public File[] ls(String pathname) {
        File file = new File(pathname);
        return file.listFiles(f -> f.isDirectory());
    }

    public File[] lsMethodExpression(String pathname) {
        File file = new File(pathname);
        return file.listFiles(File::isDirectory);
    }

    public File[] lsAnonymousClass(String pathname) {
        File file = new File(pathname);
        return file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
    }
}
