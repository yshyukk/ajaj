package egovframework.wini.main.service;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.wini.main.vo.MainVO;

@Mapper

public interface MainMapper {
	public List<MainVO> getList();
}	
