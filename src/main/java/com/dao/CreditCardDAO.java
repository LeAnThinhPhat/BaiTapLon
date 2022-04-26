/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.CreditCard;
import com.entity.Person;
import java.util.List;

/**
 *
 * @author TriPham
 */
public interface CreditCardDAO {
    public CreditCard getCreditCard(int creditCardId);
    public void saveCreditCard(CreditCard theCard, int personId);
    public void updateCreditCard(CreditCard theCard, int personId);
    public void deleteCreditCard(int creditCardId);
}
