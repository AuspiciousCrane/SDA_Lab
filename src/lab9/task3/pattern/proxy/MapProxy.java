//
// $Header: /home/due1/cvsreps/due/java/pattern/proxy/MapProxy.java.templ,v 1.1 2003-05-06 09:35:04 due Exp $
//
// Copyright (c) 2001 by Eric Dubuis,
// BFH, HTA Biel-Bienne.
// All rights reserved.

package pattern.proxy;

import java.util.HashMap;

public class MapProxy implements AbstractMap {

    public MapProxy(String fileName)
    {
        // COMPLETE
        this.fileName = fileName;
        this.getMap();
    }

    public String find(String key) throws Exception
    {
        // COMPLETE
        if (get(key) != null) {
            return get(key);
        }
        return map.find(key);




    }

    public void add(String key, String value) throws Exception
    {
        // COMPLETE
        map.add(key, value);
        put(key, value);


    }

    private Map getMap()
    {
	if (map == null) {
	    map = new Map(fileName);
	} // end of if (map == null)
	return map;
    }

    private String get(String key)
    {
	return (String) hashtable.get(key);
    }

    private void put(String key, String value)
    {
	hashtable.put(key, value);
    }

    private String fileName;
    private Map map = null;
    private HashMap hashtable = new HashMap();
}
