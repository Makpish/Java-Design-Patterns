package Composite;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextFile child1 = new TextFile(100L);
        TextFile child2 = new TextFile(200L);

        Directory root= new Directory();
        root.addFile(child1);
        root.addFile(child2);

        System.out.println(child1.getSize());      // output : 100
        System.out.println(root.getSize());    // output : 300
    }
}

interface File {
    public String getType();
    public Long getSize();
}

class TextFile implements File {
    private Long size;
    public TextFile(Long size) {
        this.size = size;
    }
    public String getType() {
        return "txt";
    }
    public Long getSize() {
        return this.size;
    }
}

class Directory implements File {
    private List<File> files = new ArrayList<>();
    public String getType() {
        return "directory";
    }
    public void addFile(File file) {
        files.add(file);
    }
    public Long getSize() {
        Long size = 0L;
        for (File file : files) {
            size = size + file.getSize();
        }
        return size;
    }
}
