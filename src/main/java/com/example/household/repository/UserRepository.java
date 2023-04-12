package com.example.household.repository;

import com.example.household.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // ユーザー情報を1件だけ取得
    User findByEmailAndPassword(String email, String encPassword);

    // 登録されている全てのメールアドレスを取得
    User findByEmail(String email);
}
