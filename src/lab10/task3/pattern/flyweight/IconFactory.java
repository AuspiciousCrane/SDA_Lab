//
// $Header: /home/due1/cvsreps/due/java/pattern/flyweight/IconFactory.java.templ,v 1.1 2002-05-14 09:41:25 due Exp $
//
// Copyright (c) 2002 Eric Dubuis,
// Berner Fachhochschule, HTA Biel.
// All rights reserved.
//
// Based on: J.W. Cooper, Java Design Patterns, Addison-Wesley 2000.

package pattern.flyweight;

import java.util.*;

public class IconFactory {
    private Map<String, AbstractIcon> iconmap = new HashMap();
    private static IconFactory instance = null;

    // Singleton.
    // COMPLETE.
    public static synchronized IconFactory getInstance() {
        if (instance == null) {
            instance = new IconFactory();
        }
        return instance;
    }






    public AbstractIcon createIcon(String key) {
        // COMPLETE.
        if (this.iconmap.get(key) == null) {
            if (key.equals("Folder")) {
                this.iconmap.put(key, new FolderIcon());
            } else if (key.equals("Java")) {
                this.iconmap.put(key, new JavaIcon());
            } else if (key.equals("Pdf")) {
                this.iconmap.put(key, new PdfIcon());
            } else if (key.equals("Picture")) {
                this.iconmap.put(key, new PictureIcon());
            } else if (key.equals("Text")) {
                this.iconmap.put(key, new TextIcon());
            } else if (key.equals("Unknown")) {
                this.iconmap.put(key, new UnknownIcon());
            }
        }

        return this.iconmap.get(key);
    }

    // Add helper methods here, if any.
}
