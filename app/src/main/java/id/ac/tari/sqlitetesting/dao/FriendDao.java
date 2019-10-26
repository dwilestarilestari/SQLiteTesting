package id.ac.tari.sqlitetesting.dao;

import android.widget.ListView;

import java.util.List;

import id.ac.tari.sqlitetesting.domain.Friend;

public interface FriendDao {
    void insert (Friend f);
    void update (Friend f);
    void delete (int id);
    Friend getAFriendById(int id);
    List <Friend> getAllFriends();

}
