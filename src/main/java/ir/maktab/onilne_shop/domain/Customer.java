package ir.maktab.onilne_shop.domain;

import ir.maktab.onilne_shop.base.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name =Customer.CUSTOMER_TABLE)
@Getter
@Setter
public class Customer extends BaseEntity<Long> {
    public static final String CUSTOMER_TABLE = "customer_table";

}
