package com.quantitymeasurement.quantitymeasurement.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "quantities")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Quantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "measurement_value")
    private Double value;

    private String unit;

    @Enumerated(EnumType.STRING)
    private com.quantitymeasurement.quantitymeasurement.enums.QuantityCategory category;
}