# Deep-Military-Camera

## 1. 개요
* 머신러닝 프레임워크인 Tensorflow와 Firebase를 이용하여 거동수상자를 감지하고 부대원들에게 빠르게 전파할 수 있는 무인 감시체계.
   ### 가. 컴퓨터 구성 / 필수조건 안내
      - 권장 : 안드로이드 API 레벨 28 (Android 9.0, Pie)
      - 최소 : 안드로이드 API 레벨 21 이상(Android 5.0, Lollipop)
   ### 나. 설치 안내
      - 
   ### 다. 사용법
      -
   ### 라. 파일 정보 및 목록
      -  ├─activity
         │      CameraActivity.java
         │      ChatActivity.java 
         │      DetectorActivity.java
         │      LoginActivity.java          
         │      MainActivity.java         
         │      SelectUserActivity.java 
         │      SplashActivity.java
         │      UserPWActivity.java
         ├─detector
         │      MultiBoxTracker.java
         │      ObjectTracker.java       
         │      TensorFlowImageClassifier.java        
         │      TensorFlowMultiBoxDetector.java        
         │      TensorFlowObjectDetectionAPIModel.java
         │      TensorFlowYoloDetector.java
         ├─env        
         │      BorderedText.java     
         │      FirestoreAdapter.java      
         │      ImageUtils.java      
         │      Logger.java      
         │      MyAppGlideModule.java      
         │      MyFirebaseMessagingService.java      
         │      Size.java
         │      SplitTimer.java
         ├─fragment
         │      CameraConnectionFragment.java         
         │      ChatFragment.java         
         │      ChatRoomFragment.java         
         │      LegacyCameraConnectionFragment.java         
         │      UserFragment.java         
         │      UserListFragment.java         
         │      UserListInRoomFragment.java         
         ├─model
         │      ChatModel.java      
         │      ChatRoomModel.java 
         │      Classifier.java  
         │      GlobalBus.java       
         │      Message.java
         │      NotificationModel.java         
         │      ResultsView.java         
         │      UserModel.java         
         └─view        
                AutoFitTextureView.java     
                HackyViewPager.java           
                OverlayView.java           
                RecognitionScoreView.java  
                ViewPagerActivity.java 
    
   ### 마. 저작권 및 사용권 정보
      - Tensorflow  
                          Apache 2.0 Open Source Library

             Copyright 2019 The TensorFlow Authors.  All rights reserved.

                                 Apache License
                           Version 2.0, January 2004
                        http://www.apache.org/licenses/
                        
                        
      - Otto

        Copyright 2013 Square, Inc.

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

           http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.

   ### 바. 배포자 및 개발자의 연락처 정보
      - 해)중위 최준혁 : 군)910-6625, 일) 010-2471-7714
      - 해)중위 김형민 : 군)910-5752, 일) 010-3251-7028     
   ### 사. 알려진 버그
      - Android Studio에서 프로젝트 빌드시 'File google-services.json is missing.
        The Google Services Plugin cannot function without it.' 메세지와 함께 실패.    
   ### 아. 문제 발생에 대한 해결책
      - 파이어베이스 이용을 위한 환경설정 파일인 'google-services.json' 파일이 민감정보를
        포함하고 있기때문에 GitHub 업로드시 누락되어 일어나는 현상으로 [파이어베이스 콘솔] -
        [프로젝트 설정] - [내 앱] 탭의 최신 구성 파일 다운로드를 통하여 프로젝트 최상위에 추가시켜준다.
        (참고 : https://m.blog.naver.com/PostView.nhn?blogId=ndb796&logNo=221406814289&proxyReferer=https%3A%2F%2Fwww.google.com%2F)
     
   ### 자. 크레딧
      - R.O.K Navy Office of Public Affairs, Troop Information & Education
      - R.O.K Navy Information Systems Management Group
   ### 차. 업데이트 정보
      -
      
## 2. 기사 모음

* [싼 게 비지떡, IP 카메라](https://www.pentasecurity.co.kr/column/%EC%8B%BC-%EA%B2%8C-%EB%B9%84%EC%A7%80%EB%96%A1-ip-%EC%B9%B4%EB%A9%94%EB%9D%BC/)


* [군 경계 시스템 사업에 ‘지능형 CCTV 인증제도’ 도입](https://www.boannews.com/media/view.asp?idx=66152)

* [왜 거의 다 ‘인재(人災)’라고만 하죠?](http://www.econovill.com/news/articleView.html?idxno=308623)

* [[단독] 스마트폰으로 작전지시하는 軍…10년 헛수고 무전기사업 재시동 - 매일경제](https://www.mk.co.kr/news/politics/view/2019/07/520019/)

* [전차 등에 장착 軍후방카메라, 밤이면 먹통](http://www.donga.com/news/article/all/20191007/97757086/1)

* [스마트폰으로 작전지시하는 軍…10년 헛수고 무전기사업 재시동](https://www.mk.co.kr/news/politics/view/2019/07/520019/)

## 3. 참고자료

* [Detect Facial Features in Photos](https://developers.google.com/vision/android/detect-faces-tutorial)

* [Android에서 내가 학습한 YOLO 모델을 이용해 Object Detection 구현하기](https://junyoung-jamong.github.io/machine/learning/2019/01/25/Android%EC%97%90%EC%84%9C-%EB%82%B4-YOLO%EB%AA%A8%EB%8D%B8-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0.html)

* [안드로이드 카메라 예제 ( 프리뷰 및 사진찍기 )](https://webnautes.tistory.com/822)

* [googlearchive/android-Camera2Basic ](https://github.com/googlearchive/android-Camera2Basic/blob/master/Application/src/main/res/layout/fragment_camera2_basic.xml)

* [안드로이드 카메라 예제 스터디](https://brunch.co.kr/@mystoryg/54)
