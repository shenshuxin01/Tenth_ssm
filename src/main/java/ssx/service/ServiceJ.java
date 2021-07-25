package ssx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssx.dao.IDaoJ;

import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceJ {
    @Autowired
    IDaoJ iDaoJ;

    public Map addName(Map map){
        String p_name = map.get("p_name").toString();
        boolean b = iDaoJ.addName(p_name);
        HashMap hashMap = new HashMap();
        hashMap.put("yesno",b);
        return hashMap;
    }
}
