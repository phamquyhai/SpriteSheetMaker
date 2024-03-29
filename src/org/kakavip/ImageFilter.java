package org.kakavip;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class ImageFilter extends FileFilter {

  
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = Utils.getExtension(f);
        if (extension != null) {
            if (extension.equals(Utils.tiff) ||
                extension.equals(Utils.tif) ||
                extension.equals(Utils.jpeg) ||
                extension.equals(Utils.jpg) ||
                extension.equals(Utils.png)) {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public String getDescription() {
        return "Only *.png, *.jpg, *.tif, *.tiff | ^^ *.xxx";
    }
}