package com.simplilearn.medicare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.simplilearn.medicare.model.cart.CartItem;
import com.simplilearn.medicare.model.cart.CartItemPK;

public interface CartItemRepository extends JpaRepository <CartItem, CartItemPK> {
}
