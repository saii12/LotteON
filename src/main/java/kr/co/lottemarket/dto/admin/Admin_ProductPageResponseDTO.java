package kr.co.lottemarket.dto.admin;

import java.util.List;


import kr.co.lottemarket.dto.product.ProductDTO;
import lombok.Builder;
import lombok.Data;

@Data
public class Admin_ProductPageResponseDTO {

    private List<ProductDTO> dtoList;
    private int pg;
    private int size;
    private int total;
    private String search;
    private String searchCate;
    
    private int start, end;
    private boolean prev, next;

    @Builder
    public Admin_ProductPageResponseDTO(Admin_ProductPageRequestDTO pageRequestDTO, List<ProductDTO> dtoList, int total) {
    	
    	this.search = pageRequestDTO.getSearch();
        this.searchCate = pageRequestDTO.getSearchCate();
        this.pg = pageRequestDTO.getPg();
        this.size =  pageRequestDTO.getSize();
        this.dtoList = dtoList;
        this.total = total;

        this.end = (int) (Math.ceil(this.pg/10.0)) * 10;
        this.start = this.end - 9;
        int last = (int) (Math.ceil(total / (double) size));

        this.end = end > last ? last : end;
        this.prev = this.start > 1;
        this.next = total > this.end * this.size;

    }

}
