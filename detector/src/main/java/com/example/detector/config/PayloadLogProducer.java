package com.example.detector.config;


import com.example.detector.domain.comment.model.NewCommentsPayloadData;
import com.example.detector.domain.emoji.model.NewEmojiPayloadData;
import com.example.detector.domain.interaction.model.NewInteractionPayloadData;
import com.example.detector.domain.post.model.NewPostPayloadData;
import com.example.detector.domain.role.model.NewRolePayloadData;
import com.example.detector.domain.user.model.NewUsersPayloadData;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PayloadLogProducer {
    private final KafkaTemplate<String,Object> kafkaTemplate;


    public void sendNewCommentsPayloadLogCaptureMessage(NewCommentsPayloadData newCommentsPayloadData, String topic){
        kafkaTemplate.send(topic, newCommentsPayloadData);
        //"payload_log"
    }
    public void sendNewEmojiPayloadLogCaptureMessage(NewEmojiPayloadData newEmojiPayloadData, String topic){
        kafkaTemplate.send(topic, newEmojiPayloadData);
        //"payload_log"
    }
    public void sendNewInteractionPayloadLogCaptureMessage(NewInteractionPayloadData newInteractionPayloadData, String topic){
        kafkaTemplate.send(topic, newInteractionPayloadData);
        //"payload_log"
    }
    public void sendNewPostPayloadLogCaptureMessage(NewPostPayloadData newPostPayloadData, String topic){
        kafkaTemplate.send(topic, newPostPayloadData);
        //"payload_log"
    }
    public void sendNewRolePayloadLogCaptureMessage(NewRolePayloadData newRolePayloadData, String topic){
        kafkaTemplate.send(topic, newRolePayloadData);
        //"payload_log"
    }
    public void sendNewUserPayloadLogCaptureMessage(NewUsersPayloadData newUsersPayloadData, String topic){
        kafkaTemplate.send(topic, newUsersPayloadData);
        //"payload_log"
    }
}