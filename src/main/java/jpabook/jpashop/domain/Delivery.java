package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery",fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    // String 으로 해야 숫자가 안밀림 ORDINAL 사용 금지
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; // READY, COMP

}
