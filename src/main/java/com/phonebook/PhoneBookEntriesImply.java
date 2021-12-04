package com.phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBookEntriesImply {
    static HashMap<String, String> phoneMap = new HashMap<>();
         static {
                phoneMap.put("Deepak","9897999999");
                phoneMap.put("Shubham","8171989888");
            }
    Map<String, String> phoneMapEntries = phoneMap;

     public Optional<String> findPhoneNumberByName(String name) {
        if (phoneMapEntries.containsKey(name)) {
            return Optional.of(phoneMapEntries.get(name));
        }
        return Optional.empty();
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {

        for (Map.Entry<String, String> entry : phoneMapEntries.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return Optional.of(entry.getKey());
            }
        }
               return Optional.empty();
        }
    @Override
    public String toString() {
         return "PhoneBook{" +
                "phoneBookEntries=" + phoneMapEntries +
                '}';
    }
}


