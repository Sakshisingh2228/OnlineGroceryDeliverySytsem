package com.clickit.dao;

import com.clickit.model.BankAccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountDetailDao extends JpaRepository<BankAccountDetail,Integer> {
}
