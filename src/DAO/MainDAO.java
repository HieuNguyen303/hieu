package DAO;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public abstract class MainDAO <EntityType, KeyType> {
    
    public abstract void Insert(EntityType E);
    public abstract void Update(EntityType E);
    public abstract void Delete(KeyType ID);
    
    public abstract List<EntityType> SelectAll();
    public abstract EntityType SelectById(KeyType Id);
    public abstract List<EntityType> selectBySQL(String sql, Object... args);
}
