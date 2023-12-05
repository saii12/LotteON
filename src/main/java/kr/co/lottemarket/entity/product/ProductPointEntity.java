package kr.co.lottemarket.entity.product;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import kr.co.lottemarket.dto.product.ProductPointDTO;
import kr.co.lottemarket.entity.user.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lotte_point")
public class ProductPointEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pointNo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uid")
	private UserEntity user;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ordNo")
	private ProductOrderEntity order;
	private int point;
	private String type;
	@CreationTimestamp
	private LocalDateTime pointDate;
	
	public ProductPointDTO toDTO() {
		
		return ProductPointDTO.builder()
				.pointNo(pointNo)
				.user(user)
				.order(order)
				.type(type)
				.point(point)
				.pointDate(pointDate)
				.build();
	}
	
	
}
