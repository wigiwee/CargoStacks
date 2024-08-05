package com.TinkerersLab.CargoStacks.services;

import com.TinkerersLab.CargoStacks.models.dao.components.Component;
import com.TinkerersLab.CargoStacks.repository.ComponentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentsService {
    @Autowired
    ComponentsRepo componentsRepo;

    public Component getComponentById(int id) {
        return componentsRepo.findById(id).orElse(new Component());
    }


    public List<Component> getAllComponents() {
        return componentsRepo.findAll();
    }

    public List<Component> searchComponent(String keyword) {
        return componentsRepo.searchComponent(keyword);
    }

    public Component addComponent(Component component) {
        return componentsRepo.save(component);
    }

    public Component deleteById(int id) {
        Component component = getComponentById(id);
        componentsRepo.deleteById(id);
        return component;
    }

    public Component updateComponent(Component component) {
        return componentsRepo.save(component);
    }
}
