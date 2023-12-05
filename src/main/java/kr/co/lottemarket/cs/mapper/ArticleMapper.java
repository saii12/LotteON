package kr.co.lottemarket.cs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.lottemarket.dto.ArticleDTO;

@Mapper
public interface ArticleMapper {
	
	public List<ArticleDTO> selectArticles(int group,int cate1);
	
	public List<ArticleDTO> selectCate1(int group);
	
	public List<ArticleDTO> selectIndex(int group);
	
	public List<ArticleDTO> selectAjaxCate2(int group, int cate1);

	public List<ArticleDTO> selectAjaxCate1(int group);
	
	public ArticleDTO selectAnswer(int parent);
	
	//글 보기
	public ArticleDTO selectArticle(int no);
	
	//faq nav
	public ArticleDTO selectNav(int group, int cate1);
	
	//MyPage Article
	public List<ArticleDTO> selectMyQna(String uid, int start , int end);
	
	public int selectMyCountTotal(String uid);
	
	
	public List<ArticleDTO> selectNoticeArticles();

	//notice에 맞는 cate출력하기
	public List<ArticleDTO> selectNoticeCate();
	
	
	public void deleteArticle(int no);

}
