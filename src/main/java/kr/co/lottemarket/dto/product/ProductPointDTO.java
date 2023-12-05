package kr.co.lottemarket.dto.product;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import kr.co.lottemarket.entity.product.ProductOrderEntity;
import kr.co.lottemarket.entity.product.ProductPointEntity;
import kr.co.lottemarket.entity.user.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductPointDTO {

	private int pointNo;
	private UserEntity user;
	private ProductOrderEntity order;
	private int point;
	private String type;
	private LocalDateTime pointDate;
	
	public ProductPointEntity toEntity() {
		
		return ProductPointEntity.builder()
				.pointNo(pointNo)
				.user(user)
				.order(order)
				.type(type)
				.point(point)
				.pointDate(pointDate)
				.build();
	}
}
