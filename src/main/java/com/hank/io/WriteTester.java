package com.hank.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir = new File("/Users/smallpig/IdeaProjects/myproject/jk");
        jkDir.mkdir();
        FileWriter fw = new FileWriter("/Users/smallpig/IdeaProjects/myproject/jk/output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }
}
