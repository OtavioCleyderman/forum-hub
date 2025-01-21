package br.com.java.main.controller;

import br.com.forumhub.model.Topic;
import br.com.forumhub.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @PostMapping
    public Topic createTopic(@RequestBody Topic topic) {
        return topicService.createTopic(topic);
    }

    @PutMapping("/{id}")
    public Topic updateTopic(@PathVariable Long id, @RequestBody Topic topic) {
        return topicService.updateTopic(id, topic);
    }

    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
    }
}
