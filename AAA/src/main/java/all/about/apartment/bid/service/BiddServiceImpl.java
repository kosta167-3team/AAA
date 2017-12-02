package all.about.apartment.bid.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import all.about.apartment.bid.domain.BidProductVO;
import all.about.apartment.bid.domain.FileVO;
import all.about.apartment.bid.persistence.BidDAO;
import all.about.apartment.bid.persistence.BidderDAO;

@Service
public class BiddServiceImpl implements BiddService {
	
	@Inject
	private BidderDAO dao;

	@Override
	public BidProductVO bidDetail(String bid_id) throws Exception{
		return dao.bidDetail(bid_id);
		
	}

	
}
