# MOVIDIC : 영화 평점 등록 사이트

‼ Idea : 사용자가 원하는 간단하고 쉽게 영화 평점별로 보기 쉽게 보는 사이트를 만들어보까?

## 시연

동영상ㅇㅇ

## 개발 인원 (2명)
- 전영호
    - DB설계, 회원가입, 로그인, 상세 페이지 담당, 댓글 등록/삭제
    - 평점 등록, 카카오 지도 Api 연동
- 이진호
    - DB설계, 메인 페이지 담당, Pagination 구현

## 주요 기능과 로직

- **댓글 기능** : 영화 상세페이지에서 댓글 등록, 삭제
- **페이징 기능** : 카테고리 페이지 10개씩 보내줌
- **지도** : 카카오 지도 API 사용 (메인페이지, 상세페이지)
- **크롤링** : 영화진흥위원회에서 영화정보 크롤링 (Python 사용)
<!-- - **배포** : AWS EC2로 배포하고 도메인에 연동 (jar파일로 빌드) -->
- **DB** : AWS MySQL에 미리 크롤링한 영화 데이터(Movie)와 새로 생기는 데이터 저장

## 서비스 구조

![service](https://user-images.githubusercontent.com/93497987/168542386-f81daff4-43b0-4153-bf6c-ebe9b216ba45.jpg)



## 기술 스택

- Front
    - Javascript, JSP, CSS
- Back
    - Java - version 8, SpringBoot, Maven, Junit4, MySQL, AWS(RDS)


## 개발 기간

- 2022.5.6 ~ 5.16  (2주)
    

## 기획 & 설계

[기능 명세서](https://inky-krypton-cd8.notion.site/Java-f94cdf5191b646e6a308c2a5bffab496)

[API 명세서](https://inky-krypton-cd8.notion.site/API-4e0be387f60745809b04828a2f09a730)

[API 문서](https://inky-krypton-cd8.notion.site/API-cc02652dec424508acf47c23c7647556)

[DB 명세서](https://inky-krypton-cd8.notion.site/DB-72f71aabc6b04ce29ab19ccf74e90dfe)

## Git Projects(프로젝트 스케줄 보드)
![화면 캡처 2022-05-16 142438](https://user-images.githubusercontent.com/93497987/168541724-7f21d1e9-b533-44b2-bc54-950c57899334.png)
