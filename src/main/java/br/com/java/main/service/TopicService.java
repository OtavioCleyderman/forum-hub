package br.com.java.main.service;

import br.com.forumhub.model.Topic;
import br.com.forumhub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic createTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Long id, Topic topic) {
        topic.setId(id);
        return topicRepository.save(topic);
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
