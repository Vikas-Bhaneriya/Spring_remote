package com.example.demo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicservice ;
/*for Get Metod*/
    @RequestMapping("/topics")
    public List<Topics> GetTopicList()
    {

        return topicservice.GetTopics();
    }
    /*Get topics by Id*/
    @RequestMapping("/topics/{id}")
    public Topics GetTopicList(@PathVariable String id)
    {
        return topicservice.GetIdTopic(id);
    }


/*New topic added*/
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void AddTopics(@RequestBody Topics Addtopic)
    {
     topicservice.AddTopic(Addtopic);

    }

/*    Update the Topics with Id*/
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void UpdateTopic(@RequestBody Topics Updatetopic, @PathVariable String id)
    {
        topicservice.UpdateTopic(Updatetopic, id);

    }

/*delelte Topics*/
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void UpdateTopic( @PathVariable String id)
    {
        topicservice.DeleteTopic(id);

    }

}
