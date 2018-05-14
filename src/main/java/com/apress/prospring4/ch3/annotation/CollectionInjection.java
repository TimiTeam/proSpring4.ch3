package com.apress.prospring4.ch3.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Service("injectCollection")
public class CollectionInjection {

    @Resource(name ="map") // For correctly inject collection we using @Resource annotation
    private Map<String, Object> map;

    @Resource(name = "set")
    private Set set;

    @Resource(name = "list")
    private List list;

    @Resource(name = "properties")
    private Properties properties;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Map \n");
        for (Map.Entry<String,Object> entry:map.entrySet()){
            sb.append("Key: "+entry.getKey()+" - value: "+entry.getValue().toString()+"\n");
        }
        sb.append("Properties \n");
        for(Map.Entry<Object,Object> entry:properties.entrySet()){
            sb.append("Key: "+entry.getKey()+" - value: "+entry.getValue().toString()+"\n");
        }
        sb.append("Set \n");
        for(Object o: set){
            sb.append("value: "+o.toString()+"\n");
        }
        sb.append("List \n");
        for(Object o:list){
            sb.append("value: "+o.toString()+"\n");
        }


        return sb.toString();
    }
}
