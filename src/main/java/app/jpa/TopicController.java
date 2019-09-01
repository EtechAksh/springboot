package app.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") int id) {
        return topicService.getById(id);
    }


//    @RequestMapping("/topics/{topic_id}")
//    public Topic getTopic(@PathVariable("topic_id") int id) {
//        return topicService.getAllTopics().stream().filter(it -> it.id == id).findFirst().get();
//    }

    @PostMapping(value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@PathVariable int id, @RequestBody Topic topic) {
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping(value = "/topics/{topic_id}")
    public void deleteTopic(@PathVariable("topicid") int id) {
        topicService.deleteTopic(id);
    }
}
