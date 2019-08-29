package com.example.demo12;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topics> topic = new ArrayList<>(Arrays.asList(

            new Topics("Java", "java is Programing Language", "developed By oracle"),
            new Topics("JavaScript", "JavaScript is Programing Language", "developed By oracle"),
            new Topics("Python", "JavaScript is Programing Language", "developed By ABC"),

            new Topics("SpringBoot", "SpringBoot is Programing Language", "developed By XYZ")
    )
    );

/*get Methods*/

    public List<Topics> GetTopics() {

        return topic;

    }


/*Post Methods*/
    public Topics GetIdTopic(String id)
    {

     return topic.stream().filter(t->t.getId().equals(id)).findFirst().get();

    }
      public void AddTopic( Topics Addtopic){
        topic.add(Addtopic);
      }

/*Update Methods*/
    public void UpdateTopic(Topics Updatetopic, String id) {
     for(int i=0; i<topic.size(); i++)
     {
         Topics t = topic.get(i);
         if(t.getId().equals(id))
         {
             topic.set(i, Updatetopic);
         }

     }


    }

    /*for delelte */

    public void DeleteTopic(String id) {
        topic.removeIf(t->t.getId().equals(id));
        return;
    }
}

