package com.Learning.Learning;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

@Service
public class AddNewKPI {

    public void printEventsQuery(List<EventsData> datas){
        int index=1;
        StringBuilder sb = new StringBuilder();
        for(EventsData data:datas){
            sb.append("INSERT INTO node_event_metric VALUES (").append(index++).append(",'").append(data.getDisplayName()).append("','").append(data.getName())
                    .append("','").append(data.getEventType()).append("',").append(data.isAlarm()).append(",").append("false").append(",'").append(data.getKey())
                    .append("','").append(data.getNodeType()).append("','").append(data.getPrometheusId()).append("','").append(data.getTrapId()).append("');")
                    .append("\n");
        }
        try(FileWriter fw = new FileWriter(new File("/home/nambisv/Documents/EventsQuery.txt"))){
            fw.write( sb.toString());
        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
