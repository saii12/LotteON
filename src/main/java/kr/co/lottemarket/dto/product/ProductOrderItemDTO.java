package kr.co.lottemarket.dto.product;

import kr.co.lottemarket.entity.product.ProductEntity;
import kr.co.lottemarket.entity.product.ProductOrderItemEntity;
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
public class ProductOrderItemDTO {

	
	private int ordNo;
	private ProductEntity product;
	private UserEntity user;
	private int count;
	private int price;
	private int discount;
	private int point;
	private int delivery;
	private int total;
	
	public ProductOrderItemEntity toEntity() {
		return ProductOrderItemEntity.builder()
				.ordNo(ordNo)
				.product(product)
				.user(user)
				.count(count)
				.price(price)
				.discount(discount)
				.point(point)
				.delivery(delivery)
				.total(total)
				.build();
	}
	
	
	
}
