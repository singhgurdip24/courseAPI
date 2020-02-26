package io.codesingh.springbootquickstart.topic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
		    new Topic("spring", "Spring Framework", "Spring Framework Description"),
		    new Topic("java", "Core Java", "Core Java Description"),
		    new Topic("javascript", "JavaScript", "JavaScript Description")));
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(e->topics.add(e));
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
