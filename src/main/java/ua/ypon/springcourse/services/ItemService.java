package ua.ypon.springcourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.ypon.springcourse.models.Item;
import ua.ypon.springcourse.models.Person;
import ua.ypon.springcourse.repositories.ItemsRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemService {

    private final ItemsRepository itemsRepository;

    @Autowired
    public ItemService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Item> findByItemName(String itemName) {//custom method
        return itemsRepository.findByItemName(itemName);
    }

    public List<Item> findByOwner(Person owner) {//custom method
        return itemsRepository.findByOwner(owner);
    }
}
