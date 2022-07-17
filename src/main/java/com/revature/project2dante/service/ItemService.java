package com.revature.project2dante.service;

import com.revature.project2dante.model.Item;
import com.revature.project2dante.repository.ArmorRepository;
import com.revature.project2dante.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {


        private final ItemRepository ItemRepository;

        public ItemService(ItemRepository ItemRepository) {
            this.ItemRepository = ItemRepository;
        }
        //create
        public Item createItem(Item item) {
            return ItemRepository.save(item);
        }
        //Get
        public List<Item> getAllItems() {
            return ItemRepository.findAll();
        }


    public void deleteItemById(Integer itemId) {
        ItemRepository.deleteById(itemId);

    }

    public Item updateItem(Integer itemId, Item item) {
        return ItemRepository.save(item);
    }

    public Item getItemById(Integer itemId) {
        return ItemRepository.findById(itemId).get();
    }
}
