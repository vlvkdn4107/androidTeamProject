
# Project - MelonTube (뮤직 플레이어 어플)

<br/>

## 프로젝트 기간
2022.06.08 ~ 2022.06.14

<br/>

## 프로젝트 소개

<br/>

## 파트 분배
- 정규동 : 스플래시 화면, 곡명/가수명 곡 검색 기능
- 박지현 : 메인화면, 앨범/순위별 곡 조회 기능, 음악 재생 기능
- 임우성 : 내 재생목록 화면, 내 재생목록 추가, 삭제 기능

<br/>

## 기능 설명

- 곡 목록 조회
		- 순위별 곡 목록 조회, 앨범별 수록곡 조회 기능 구현

- 음악 재생 기능
		- exoPlayer 사용한 음악 재생 기능 구현

- 음악 검색
		- TextWatcher 사용하여 텍스트 입력시마다 검색결과 출력하도록  구현

- 내 재생목록 추가 / 삭제
		- SharedPreferences 사용하여 어플 종료시에도 추가된 곡들이 사라지지 않도록 구현

<br/>

## 화면 구성

- 스플래시 화면 제외 총 3가지 프래그먼트로 구성된 화면 구현

### Splash
![KakaoTalk_20220729_011403534](https://user-images.githubusercontent.com/96460131/181588575-ec638ada-59b3-4bb2-ba14-3e74c7358c1f.gif)

<br/>

### 메인 화면
- 곡 재생
- 앨범별 수록곡 조회
- 선택한 곡 내 재생목록에 추가

|차트 조회| 앨범별 수록곡 조회 |
|--|--|
|![KakaoTalk_20220729_011403316](https://user-images.githubusercontent.com/96460131/181588910-461d1107-b4ad-4352-9492-5e51abbfad4e.gif) |  ![KakaoTalk_20220729_014330084](https://user-images.githubusercontent.com/96460131/181593988-571cbe82-a49b-40b1-9c06-c79a2454dd35.gif)
 |

### 음악 재생
![KakaoTalk_20220729_011402653](https://user-images.githubusercontent.com/96460131/181590231-890ee5ef-82c8-4f0d-bfa3-cd08b571dc66.gif)

<br/>


### 음악 검색 화면
- 검색어에 따른 가수, 노래 조회


![KakaoTalk_20220729_011404262](https://user-images.githubusercontent.com/96460131/181589691-bc661e4b-e2df-4dc4-8f34-a3d6c75e3656.gif)

<br/>

### 내 재생목록 화면
- 재생목록에 있는 곡 재생, 재생목록에서 삭제 기능

![KakaoTalk_20220729_011403803](https://user-images.githubusercontent.com/96460131/181588987-7ee0e016-3f2c-4e42-b75a-0d7ef300ab15.gif)

