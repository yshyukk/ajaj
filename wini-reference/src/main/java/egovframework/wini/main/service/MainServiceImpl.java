package egovframework.wini.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.wini.main.vo.MainVO;

@Service
public class MainServiceImpl implements MainService{
	@Autowired
	MainMapper mMapper;

	@Override
	public List<MainVO> getList() {
		
		return mMapper.getList();
	}
}
