package com.example.persistence;

import java.util.List;

import com.example.domain.MBasketMVO;
import com.example.domain.MedicineVO;
import com.example.domain.ReplyVO;
import com.example.domain.SearchCriteria;

public interface MBMDAO {
	public List<MBasketMVO> mmlist(String mmid,SearchCriteria cri) throws Exception;
	public void mminsert(MBasketMVO vo) throws Exception;
	public int mmtotal(String mmid) throws Exception;
	public MedicineVO mmread(int mmrecent) throws Exception;
	public List<ReplyVO> replist(String replyname);
}
