package jpabook.jpashop.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id@GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;
    @Embedded
    private Address address;

    //Order안에 있는 member에 의해 매핑 됐다는 뜻
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
