package com.example.JobFinderApi.Service;

import com.example.JobFinderApi.Pojo.Entity.Address;
import com.example.JobFinderApi.Pojo.Entity.User;
import com.example.JobFinderApi.Pojo.Input.UserInput;
import com.example.JobFinderApi.Repository.AddressRepository;
import com.example.JobFinderApi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public User createUser(UserInput userInput) {
        Address address = new Address(userInput.getAddress().getCity(),userInput.getAddress().getCountry());
        addressRepository.save(address);
        User user = new User(userInput.getUsername(), address);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(UserInput userInput, int user_id) {
        User user = userRepository.findUserById(user_id);
        if (userInput.getAddress() != null){
            Address address = new Address(userInput.getAddress().getCity(),userInput.getAddress().getCountry());
            addressRepository.save(address);
            user.setAddress(address);
        }
        user.setUsername(userInput.getUsername());
        return userRepository.save(user);
    }
}
