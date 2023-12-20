package com.kh.finalProject.place.model.service;


import java.util.ArrayList;

import com.kh.finalProject.common.vo.PageInfo;
import com.kh.finalProject.member.model.vo.Member;
import com.kh.finalProject.member.model.vo.SportInfo;
import com.kh.finalProject.place.model.vo.Field;
import com.kh.finalProject.place.model.vo.Place;
import com.kh.finalProject.place.model.vo.PlaceImg;
import com.kh.finalProject.place.model.vo.Reservation;

public interface PlaceService {
	//경기장 등록
	int insertPlace(Place p);
	//경기장 사진 등록
	int insertPlaceImg(PlaceImg pi);
	
	int placeListCount(Place pl);
	ArrayList<Place> selectPlaceList(PageInfo pi, Place pl);
	Place placeDetailview(int fno);
	ArrayList<Place> selectResPlaceList();
	int placeResCount(int fno);
	ArrayList<Place> searchPlace(String selectValue);
	int insertResMatch(Reservation res);
	int payPoint(Member loginUser);
	int checkResMatch(Reservation res);
	ArrayList<PlaceImg> placeImgList(int fno);
	ArrayList<Reservation> selectResList(int userNo);
	int deleteReservation(int resNo);
	
	// 매니저 게임 다 가져오기
	ArrayList<Field> selectManager(String userName);
	// 게임에 참가했던 애들 조회
	ArrayList<SportInfo> selectMember(int fieldNo, int categoryNum);
	// 경기 결과 업데이트 시켜주기 
	int updateEval(SportInfo spoInfo);
	// 평가 한 후 필드 이미지 삭제 
	int fieldNoDel(int fieldNo);
	// 평가 한 후 필드 삭제
	int fieldDelet(int fieldNo);

}
