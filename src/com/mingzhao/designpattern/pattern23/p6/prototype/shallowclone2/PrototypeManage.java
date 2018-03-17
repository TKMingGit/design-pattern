package com.mingzhao.designpattern.pattern23.p6.prototype.shallowclone2;

import java.util.Hashtable;

/**
 * Created by luoyufeng on 2017/3/7.
 */
public class PrototypeManage {
    private static PrototypeManage pm = new PrototypeManage();
    private Hashtable ht = new Hashtable();

    private PrototypeManage(){
        ht.put("SRS", new SRS());
        ht.put("FAR",new FAR());
        ht.put("PPR",new PPR());
    }

    public void addOfficialDocument(String key,OfficialDocument officialDocument){
        ht.put(key,officialDocument);
    }

    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument)ht.get(key)).clone();
    }
    public static PrototypeManage getPrototypeManage(){
        return pm;
    }
}
