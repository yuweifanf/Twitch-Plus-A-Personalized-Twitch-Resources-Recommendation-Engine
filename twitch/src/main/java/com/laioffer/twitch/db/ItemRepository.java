package com.laioffer.twitch.db;


import com.laioffer.twitch.db.entity.ItemEntity;
import org.springframework.data.repository.ListCrudRepository;


public interface ItemRepository extends ListCrudRepository<ItemEntity, Long> {

    // SQL: SELECT * FROM items WHERE twitch_id = ?
    ItemEntity findByTwitchId(String twitchId);
}
