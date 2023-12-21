package Practice_21.Exercise_3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryLister {
    public static List<String> listDirectory(String path) {
        List<String> fileList = new ArrayList<>();

        File directory = new File(path);
        File[] files = directory.listFiles();

        if (files != null) {
            for (int i = 0; i < files.length && i < 5; i++) {
                fileList.add(files[i].getName());
            }
        }
        return fileList;
    }

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\sonia\\OneDrive\\Рабочий стол\\практики по сиаоду\\практика по сиаоду 3";
        List<String> fileList = listDirectory(directoryPath);

        System.out.println("First 5 elements in the directory: ");
        for (int i = 0; i < fileList.size(); i++) {
            System.out.println(fileList.get(i));
        }
    }
}
