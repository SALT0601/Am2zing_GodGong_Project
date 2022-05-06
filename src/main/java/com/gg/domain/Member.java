package com.gg.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.crypto.password.PasswordEncoder;

// ORM - Object Relation Mapping

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Member {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String memberEmail;

    private String memberPassword;

    private String memberBirth;

    private String memberNickname;

    @CreationTimestamp
    private Timestamp memberCreated;

}
