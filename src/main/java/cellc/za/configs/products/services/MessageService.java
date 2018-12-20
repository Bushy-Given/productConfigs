package cellc.za.configs.products.services;

import cellc.za.configs.products.constants.Messages;
import cellc.za.configs.products.repoitories.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {

    private MessagesRepository messagesRepository;

    public @Autowired MessageService(MessagesRepository messagesRepository){
        this.messagesRepository = messagesRepository;
    }

    public Messages findMessageById(Long id){
        return messagesRepository.findMessageById(id);
    }
}
