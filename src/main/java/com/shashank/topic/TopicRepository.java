package com.shashank.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {



    /***
     * CURD OPERATIONS
     * getAllTopics()
     * getTopic(String id)
     * updateTopic(Topic topic)
     * deleteTopic(String id)
     * */

}
