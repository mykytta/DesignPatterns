package com.mykyta.models.iterator;

public class RegularUser implements Collection{
    private String name;
    private String[] friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public RegularUser(String name, String[] friends) {
        this.name = name;
        this.friends = friends;
    }


    @Override
    public Iterator getIterator() {
        return new FriendIterator();
    }

    private class FriendIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < friends.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            return friends[index++];
        }
    }
}
