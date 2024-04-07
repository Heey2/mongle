# mongle  

### 📌 Summary
"Money" + "Mingle" == 돈을 혼합하다 또는 섞다 라는 의미로,

자산을 다양한 방식으로 혼합하고 관리할 수 있는, 자산 관리 프로그램(콘솔 기반)입니다.

---

### 💡 주요기능
1. 회원가입 / 로그인 / 로그아웃
     - 비밀번호 암호화(SHA-256) 적용
       
2. 계좌 생성 및 연동
     - 콘솔 내 가상 계좌 생성
       
3. 실시간 주식, 대출, 금 시세, 환율, 예적금 정보 연동
     - OpenAPI를 활용하여 실시간 정보 수집
       
4. 연동 데이터를 이용한 투자 거래 기능
     - 데이터를 기반으로 프로그램 내 가상 투자
       
5. 계좌에 투자 내역 연동 / 거래 내역 확인 기능
   
6. 안심송금서비스 기능
     - 모르는 계좌로부터 입금 시도 시 알림
     - 새로운 계좌로 송금 시, 수신자 측 수신 여부 확인 후 송금 완료
       
7. 문의 내역 기능
     - 회원 / 관리자 별로 분리하여 구현

---

### 🔨 Tech Stack
- Java

---

### 🔎 API
1. [금융감독원 : 예적금 상품 API](https://finlife.fss.or.kr/finlife/main/contents.do?menuNo=700029)
2. [금융감독원 : 대출 상품 API](https://finlife.fss.or.kr/finlife/main/contents.do?menuNo=700029)
3. [한국수출입은행 : 현재 환율 API](https://www.koreaexim.go.kr/ir/HPHKIR020M01?apino=2&viewtype=C&searchselect=&searchword=)
4. [금융위원회 : 금 시세 API](https://www.data.go.kr/data/15094805/openapi.do)
5. [금융위원회 : 주식시세 API](https://www.data.go.kr/data/15094808/openapi.do)

---

### 📜 Documents
1. [프로젝트 기획서](https://docs.google.com/document/d/1ZdwOrBu0cFKT696e7evV3AWndn-UIsmWMmrn85uw_tA/edit)
2. [요구 분석서](https://docs.google.com/document/d/1YInPnLVNhBtMfhHlAm2jITgXlptAgBSIJURjQbzS2rQ/edit)
3. [화면 설계서](https://docs.google.com/presentation/d/1kcKHMDAgqxoWS32tg92-u9XSwSFFmpgHab4iHggCDPo/edit?usp=sharing)
4. [기능 명세서](https://docs.google.com/document/d/1id4xTTHKi3gepJE_MYx7qUG5FDs5FYqV/edit)
5. [순서도](https://github.com/turmaze/mongle/assets/150693016/5f802a5e-3a4a-4c48-9e36-869455518e34)

